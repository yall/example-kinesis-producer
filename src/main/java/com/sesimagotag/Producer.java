package com.sesimagotag;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.ByteBuffer;
import java.util.Date;


public class Producer {

    private static Record getRecord() {
        Record r = new Record();
        r.setMacAdresse("74DA382DFBBD");
        r.setEnseigne("Darty");
        r.setMagasin("darty_république");
        r.setTimeConnexion1(Long.valueOf(0));
        r.setTimeConnexion2(Long.valueOf(0));
        r.setTimeConnexion3(Long.valueOf(30650));
        r.setLatence(Long.valueOf(50));
        r.setDebitDescendant(Double.valueOf(7));
        r.setDebitMontant(Double.valueOf(2));
        r.setDate(new Date());
        r.setTimeConnectWifiLan(Long.valueOf(10));
        return r;
    }

    public static void main(String[] args) throws JsonProcessingException {


        final ObjectMapper mapper = new ObjectMapper();


        final String streamNeam = System.getProperty("stream.name");

        final AWSCredentialsProvider credentialsProvider = new DefaultAWSCredentialsProviderChain();
        final AmazonKinesisClient amazonKinesisClient = new AmazonKinesisClient(credentialsProvider);
        amazonKinesisClient.setEndpoint("kinesis.eu-west-1.amazonaws.com");


        System.out.println("Put record in stream " + streamNeam);


        Record record = getRecord();
        byte[] json = mapper.writeValueAsBytes(record);

        PutRecordRequest request = new PutRecordRequest();
        request.setStreamName(streamNeam);
        request.setData(ByteBuffer.wrap(json));
        request.setPartitionKey(record.getMagasin());

        amazonKinesisClient.putRecord(request);

        System.out.println("Done");

    }

}
