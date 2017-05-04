package com.sesimagotag;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.util.Date;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Record {

	@JsonDeserialize
	@JsonProperty("mac-adresse-raspberry")
	private String macAdresse;

	@JsonDeserialize
	@JsonProperty("timestamp")
	private Date date;

	@JsonDeserialize
	@JsonProperty("delai-connexion-ms-1")
	private Long timeConnexion1;

	@JsonDeserialize
	@JsonProperty("delai-connexion-ms-2")
	private Long timeConnexion2;

	@JsonDeserialize
	@JsonProperty("delai-connexion-ms-3")
	private Long timeConnexion3;

	@JsonDeserialize
	@JsonProperty("enseigne")
	public String enseigne;

	@JsonDeserialize
	@JsonProperty("magasin")
	public String magasin;

	@JsonDeserialize
	@JsonProperty("latence-ms")
	private Long latence;

	@JsonDeserialize
	@JsonProperty("debit-descendant-ko-seconde")
	private double debitDescendant;

	@JsonDeserialize
	@JsonProperty("debit-montant-ko-seconde")
	private double debitMontant;

	@JsonDeserialize
	@JsonProperty("time-connect-to-wifi-lan-seconde")
	private Long timeConnectWifiLan;

	public Record() {
	}

	/**
	 * @return the macAdresse
	 */
	public String getMacAdresse() {
		return macAdresse;
	}

	/**
	 * @param macAdresse
	 *            the macAdresse to set
	 */
	public void setMacAdresse(String macAdresse) {
		this.macAdresse = macAdresse;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the timeConnexion1
	 */
	public Long getTimeConnexion1() {
		if(timeConnexion1 != null){
			timeConnexion1=timeConnexion1/1000;
		}
		return timeConnexion1;
	}

	/**
	 * @param timeConnexion1
	 *            the timeConnexion1 to set
	 */
	public void setTimeConnexion1(Long timeConnexion1) {
		this.timeConnexion1 = timeConnexion1;
	}

	/**
	 * @return the timeConnexion2
	 */
	public Long getTimeConnexion2() {
		if(timeConnexion2 != null){
			timeConnexion2=timeConnexion2/1000;
		}
		return timeConnexion2;
	}

	/**
	 * @param timeConnexion2
	 *            the timeConnexion2 to set
	 */
	public void setTimeConnexion2(Long timeConnexion2) {
		this.timeConnexion2 = timeConnexion2;
	}

	/**
	 * @return the timeConnexion3
	 */
	public Long getTimeConnexion3() {
		if(timeConnexion3 != null){
			timeConnexion3=timeConnexion3/1000;
		}
		return timeConnexion3;
	}

	/**
	 * @param timeConnexion3
	 *            the timeConnexion3 to set
	 */
	public void setTimeConnexion3(Long timeConnexion3) {
		this.timeConnexion3 = timeConnexion3;
	}

	/**
	 * @return the enseigne
	 */

	public String getEnseigne() {
		return enseigne;
	}

	/**
	 * @param enseigne
	 *            the enseigne to set
	 */
	public void setEnseigne(String enseigne) {
		this.enseigne = enseigne;
	}

	/**
	 * @return the magasin
	 */

	public String getMagasin() {
		if(magasin.trim().equals("darty_république")){
			magasin = "darty_907031";
		}
		return magasin;
	}

	/**
	 * @param magasin
	 *            the magasin to set
	 */
	public void setMagasin(String magasin) {
		this.magasin = magasin;
	}

	/**
	 * @return the latence
	 */
	public Long getLatence() {
		return latence;
	}

	/**
	 * @param latence
	 *            the latence to set
	 */
	public void setLatence(Long latence) {
		this.latence = latence;
	}

	/**
	 * @return the debitDescendant
	 */
	public double getDebitDescendant() {

		return debitDescendant;
	}

	/**
	 * @param debitDescendant
	 *            the debitDescendant to set
	 */
	public void setDebitDescendant(double debitDescendant) {
		this.debitDescendant = debitDescendant;
	}

	/**
	 * @return the debitMontant
	 */
	public double getDebitMontant() {


		return debitMontant;
	}

	/**
	 * @param debitMontant
	 *            the debitMontant to set
	 */
	public void setDebitMontant(double debitMontant) {
		this.debitMontant = debitMontant;
	}

	/**
	 * @return the timeConnectWifiLan
	 */
	public Long getTimeConnectWifiLan() {
		return timeConnectWifiLan;
	}

	/**
	 * @param timeConnectWifiLan
	 *            the timeConnectWifiLan to set
	 */
	public void setTimeConnectWifiLan(Long timeConnectWifiLan) {
		this.timeConnectWifiLan = timeConnectWifiLan;
	}

}
