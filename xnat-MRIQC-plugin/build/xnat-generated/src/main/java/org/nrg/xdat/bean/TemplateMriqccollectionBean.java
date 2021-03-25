/*
 * GENERATED FILE
 * Created on Thu Mar 25 10:21:19 EDT 2021
 *
 */
package org.nrg.xdat.bean;
import org.apache.log4j.Logger;
import org.nrg.xdat.bean.base.BaseElement;

import java.util.*;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE 
 *
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public class TemplateMriqccollectionBean extends XnatImageassessordataBean implements java.io.Serializable, org.nrg.xdat.model.TemplateMriqccollectionI {
	public static final Logger logger = Logger.getLogger(TemplateMriqccollectionBean.class);
	public static final String SCHEMA_ELEMENT_NAME="template:mriqcCollection";

	public String getSchemaElementName(){
		return "mriqcCollection";
	}

	public String getFullSchemaElementName(){
		return "template:mriqcCollection";
	}

	//FIELD

	private Object _BidsMeta_acquisitionsmatrixpe=null;

	/**
	 * @return Returns the bids_meta/AcquisitionsMatrixPE.
	 */
	public Object getBidsMeta_acquisitionsmatrixpe(){
		return _BidsMeta_acquisitionsmatrixpe;
	}

	/**
	 * Sets the value for bids_meta/AcquisitionsMatrixPE.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionsmatrixpe(Object v){
		_BidsMeta_acquisitionsmatrixpe=v;
	}

	//FIELD

	private Object _BidsMeta_acquisitionsnumber=null;

	/**
	 * @return Returns the bids_meta/AcquisitionsNumber.
	 */
	public Object getBidsMeta_acquisitionsnumber(){
		return _BidsMeta_acquisitionsnumber;
	}

	/**
	 * Sets the value for bids_meta/AcquisitionsNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionsnumber(Object v){
		_BidsMeta_acquisitionsnumber=v;
	}

	//FIELD

	private Object _BidsMeta_acquisitionstime=null;

	/**
	 * @return Returns the bids_meta/AcquisitionsTime.
	 */
	public Object getBidsMeta_acquisitionstime(){
		return _BidsMeta_acquisitionstime;
	}

	/**
	 * Sets the value for bids_meta/AcquisitionsTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionstime(Object v){
		_BidsMeta_acquisitionstime=v;
	}

	//FIELD

	private String _BidsMeta_bodypartexamined=null;

	/**
	 * @return Returns the bids_meta/BodyPartExamined.
	 */
	public String getBidsMeta_bodypartexamined(){
		return _BidsMeta_bodypartexamined;
	}

	/**
	 * Sets the value for bids_meta/BodyPartExamined.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_bodypartexamined(String v){
		_BidsMeta_bodypartexamined=v;
	}

	//FIELD

	private String _BidsMeta_coilstring=null;

	/**
	 * @return Returns the bids_meta/CoilString.
	 */
	public String getBidsMeta_coilstring(){
		return _BidsMeta_coilstring;
	}

	/**
	 * Sets the value for bids_meta/CoilString.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_coilstring(String v){
		_BidsMeta_coilstring=v;
	}

	//FIELD

	private String _BidsMeta_conversionsoftware=null;

	/**
	 * @return Returns the bids_meta/ConversionSoftware.
	 */
	public String getBidsMeta_conversionsoftware(){
		return _BidsMeta_conversionsoftware;
	}

	/**
	 * Sets the value for bids_meta/ConversionSoftware.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_conversionsoftware(String v){
		_BidsMeta_conversionsoftware=v;
	}

	//FIELD

	private String _BidsMeta_conversionsoftwareversion=null;

	/**
	 * @return Returns the bids_meta/ConversionSoftwareVersion.
	 */
	public String getBidsMeta_conversionsoftwareversion(){
		return _BidsMeta_conversionsoftwareversion;
	}

	/**
	 * Sets the value for bids_meta/ConversionSoftwareVersion.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_conversionsoftwareversion(String v){
		_BidsMeta_conversionsoftwareversion=v;
	}

	//FIELD

	private String _BidsMeta_deviceserioalnumber=null;

	/**
	 * @return Returns the bids_meta/DeviceSerioalNumber.
	 */
	public String getBidsMeta_deviceserioalnumber(){
		return _BidsMeta_deviceserioalnumber;
	}

	/**
	 * Sets the value for bids_meta/DeviceSerioalNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_deviceserioalnumber(String v){
		_BidsMeta_deviceserioalnumber=v;
	}

	//FIELD

	private Double _BidsMeta_echotime=null;

	/**
	 * @return Returns the bids_meta/EchoTime.
	 */
	public Double getBidsMeta_echotime() {
		return _BidsMeta_echotime;
	}

	/**
	 * Sets the value for bids_meta/EchoTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_echotime(Double v){
		_BidsMeta_echotime=v;
	}

	/**
	 * Sets the value for bids_meta/EchoTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_echotime(String v)  {
		_BidsMeta_echotime=formatDouble(v);
	}

	//FIELD

	private Object _BidsMeta_echotrainlength=null;

	/**
	 * @return Returns the bids_meta/EchoTrainLength.
	 */
	public Object getBidsMeta_echotrainlength(){
		return _BidsMeta_echotrainlength;
	}

	/**
	 * Sets the value for bids_meta/EchoTrainLength.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_echotrainlength(Object v){
		_BidsMeta_echotrainlength=v;
	}

	//FIELD

	private Object _BidsMeta_flipangle=null;

	/**
	 * @return Returns the bids_meta/FlipAngle.
	 */
	public Object getBidsMeta_flipangle(){
		return _BidsMeta_flipangle;
	}

	/**
	 * Sets the value for bids_meta/FlipAngle.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_flipangle(Object v){
		_BidsMeta_flipangle=v;
	}

	//FIELD

	private String _BidsMeta_imageorientationpatientdicom=null;

	/**
	 * @return Returns the bids_meta/ImageOrientationPatientDICOM.
	 */
	public String getBidsMeta_imageorientationpatientdicom(){
		return _BidsMeta_imageorientationpatientdicom;
	}

	/**
	 * Sets the value for bids_meta/ImageOrientationPatientDICOM.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imageorientationpatientdicom(String v){
		_BidsMeta_imageorientationpatientdicom=v;
	}

	//FIELD

	private String _BidsMeta_imagetype=null;

	/**
	 * @return Returns the bids_meta/ImageType.
	 */
	public String getBidsMeta_imagetype(){
		return _BidsMeta_imagetype;
	}

	/**
	 * Sets the value for bids_meta/ImageType.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imagetype(String v){
		_BidsMeta_imagetype=v;
	}

	//FIELD

	private String _BidsMeta_inplanephaseencodingdirectiondicom=null;

	/**
	 * @return Returns the bids_meta/InPlanePhaseEncodingDirectionDICOM.
	 */
	public String getBidsMeta_inplanephaseencodingdirectiondicom(){
		return _BidsMeta_inplanephaseencodingdirectiondicom;
	}

	/**
	 * Sets the value for bids_meta/InPlanePhaseEncodingDirectionDICOM.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_inplanephaseencodingdirectiondicom(String v){
		_BidsMeta_inplanephaseencodingdirectiondicom=v;
	}

	//FIELD

	private String _BidsMeta_modality=null;

	/**
	 * @return Returns the bids_meta/Modality.
	 */
	public String getBidsMeta_modality(){
		return _BidsMeta_modality;
	}

	/**
	 * Sets the value for bids_meta/Modality.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_modality(String v){
		_BidsMeta_modality=v;
	}

	//FIELD

	private Double _BidsMeta_imagingfrequency=null;

	/**
	 * @return Returns the bids_meta/ImagingFrequency.
	 */
	public Double getBidsMeta_imagingfrequency() {
		return _BidsMeta_imagingfrequency;
	}

	/**
	 * Sets the value for bids_meta/ImagingFrequency.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imagingfrequency(Double v){
		_BidsMeta_imagingfrequency=v;
	}

	/**
	 * Sets the value for bids_meta/ImagingFrequency.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imagingfrequency(String v)  {
		_BidsMeta_imagingfrequency=formatDouble(v);
	}

	//FIELD

	private Double _BidsMeta_inversiontime=null;

	/**
	 * @return Returns the bids_meta/InversionTime.
	 */
	public Double getBidsMeta_inversiontime() {
		return _BidsMeta_inversiontime;
	}

	/**
	 * Sets the value for bids_meta/InversionTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_inversiontime(Double v){
		_BidsMeta_inversiontime=v;
	}

	/**
	 * Sets the value for bids_meta/InversionTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_inversiontime(String v)  {
		_BidsMeta_inversiontime=formatDouble(v);
	}

	//FIELD

	private Double _BidsMeta_mracquisitiontype=null;

	/**
	 * @return Returns the bids_meta/MRAcquisitionType.
	 */
	public Double getBidsMeta_mracquisitiontype() {
		return _BidsMeta_mracquisitiontype;
	}

	/**
	 * Sets the value for bids_meta/MRAcquisitionType.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_mracquisitiontype(Double v){
		_BidsMeta_mracquisitiontype=v;
	}

	/**
	 * Sets the value for bids_meta/MRAcquisitionType.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_mracquisitiontype(String v)  {
		_BidsMeta_mracquisitiontype=formatDouble(v);
	}

	//FIELD

	private Object _BidsMeta_magneticfieldstrength=null;

	/**
	 * @return Returns the bids_meta/MagneticFieldStrength.
	 */
	public Object getBidsMeta_magneticfieldstrength(){
		return _BidsMeta_magneticfieldstrength;
	}

	/**
	 * Sets the value for bids_meta/MagneticFieldStrength.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_magneticfieldstrength(Object v){
		_BidsMeta_magneticfieldstrength=v;
	}

	//FIELD

	private Object _BidsMeta_percentphasefov=null;

	/**
	 * @return Returns the bids_meta/PercentPhaseFOV.
	 */
	public Object getBidsMeta_percentphasefov(){
		return _BidsMeta_percentphasefov;
	}

	/**
	 * Sets the value for bids_meta/PercentPhaseFOV.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_percentphasefov(Object v){
		_BidsMeta_percentphasefov=v;
	}

	//FIELD

	private Object _BidsMeta_seriesnumber=null;

	/**
	 * @return Returns the bids_meta/SeriesNumber.
	 */
	public Object getBidsMeta_seriesnumber(){
		return _BidsMeta_seriesnumber;
	}

	/**
	 * Sets the value for bids_meta/SeriesNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_seriesnumber(Object v){
		_BidsMeta_seriesnumber=v;
	}

	//FIELD

	private Object _BidsMeta_slicethickness=null;

	/**
	 * @return Returns the bids_meta/SliceThickness.
	 */
	public Object getBidsMeta_slicethickness(){
		return _BidsMeta_slicethickness;
	}

	/**
	 * Sets the value for bids_meta/SliceThickness.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_slicethickness(Object v){
		_BidsMeta_slicethickness=v;
	}

	//FIELD

	private Object _BidsMeta_spacingbetweenslices=null;

	/**
	 * @return Returns the bids_meta/SpacingBetweenSlices.
	 */
	public Object getBidsMeta_spacingbetweenslices(){
		return _BidsMeta_spacingbetweenslices;
	}

	/**
	 * Sets the value for bids_meta/SpacingBetweenSlices.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_spacingbetweenslices(Object v){
		_BidsMeta_spacingbetweenslices=v;
	}

	//FIELD

	private Double _BidsMeta_partialfourier=null;

	/**
	 * @return Returns the bids_meta/PartialFourier.
	 */
	public Double getBidsMeta_partialfourier() {
		return _BidsMeta_partialfourier;
	}

	/**
	 * Sets the value for bids_meta/PartialFourier.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_partialfourier(Double v){
		_BidsMeta_partialfourier=v;
	}

	/**
	 * Sets the value for bids_meta/PartialFourier.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_partialfourier(String v)  {
		_BidsMeta_partialfourier=formatDouble(v);
	}

	//FIELD

	private Double _BidsMeta_pixelbandwidth=null;

	/**
	 * @return Returns the bids_meta/PixelBandwidth.
	 */
	public Double getBidsMeta_pixelbandwidth() {
		return _BidsMeta_pixelbandwidth;
	}

	/**
	 * Sets the value for bids_meta/PixelBandwidth.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_pixelbandwidth(Double v){
		_BidsMeta_pixelbandwidth=v;
	}

	/**
	 * Sets the value for bids_meta/PixelBandwidth.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_pixelbandwidth(String v)  {
		_BidsMeta_pixelbandwidth=formatDouble(v);
	}

	//FIELD

	private Double _BidsMeta_repetitiontime=null;

	/**
	 * @return Returns the bids_meta/RepetitionTime.
	 */
	public Double getBidsMeta_repetitiontime() {
		return _BidsMeta_repetitiontime;
	}

	/**
	 * Sets the value for bids_meta/RepetitionTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_repetitiontime(Double v){
		_BidsMeta_repetitiontime=v;
	}

	/**
	 * Sets the value for bids_meta/RepetitionTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_repetitiontime(String v)  {
		_BidsMeta_repetitiontime=formatDouble(v);
	}

	//FIELD

	private Double _BidsMeta_sar=null;

	/**
	 * @return Returns the bids_meta/SAR.
	 */
	public Double getBidsMeta_sar() {
		return _BidsMeta_sar;
	}

	/**
	 * Sets the value for bids_meta/SAR.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sar(Double v){
		_BidsMeta_sar=v;
	}

	/**
	 * Sets the value for bids_meta/SAR.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sar(String v)  {
		_BidsMeta_sar=formatDouble(v);
	}

	//FIELD

	private String _BidsMeta_patientposition=null;

	/**
	 * @return Returns the bids_meta/PatientPosition.
	 */
	public String getBidsMeta_patientposition(){
		return _BidsMeta_patientposition;
	}

	/**
	 * Sets the value for bids_meta/PatientPosition.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_patientposition(String v){
		_BidsMeta_patientposition=v;
	}

	//FIELD

	private String _BidsMeta_phaseencodingaxis=null;

	/**
	 * @return Returns the bids_meta/PhaseEncodingAxis.
	 */
	public String getBidsMeta_phaseencodingaxis(){
		return _BidsMeta_phaseencodingaxis;
	}

	/**
	 * Sets the value for bids_meta/PhaseEncodingAxis.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_phaseencodingaxis(String v){
		_BidsMeta_phaseencodingaxis=v;
	}

	//FIELD

	private String _BidsMeta_protocolname=null;

	/**
	 * @return Returns the bids_meta/ProtocolName.
	 */
	public String getBidsMeta_protocolname(){
		return _BidsMeta_protocolname;
	}

	/**
	 * Sets the value for bids_meta/ProtocolName.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_protocolname(String v){
		_BidsMeta_protocolname=v;
	}

	//FIELD

	private String _BidsMeta_scanoptions=null;

	/**
	 * @return Returns the bids_meta/ScanOptions.
	 */
	public String getBidsMeta_scanoptions(){
		return _BidsMeta_scanoptions;
	}

	/**
	 * Sets the value for bids_meta/ScanOptions.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_scanoptions(String v){
		_BidsMeta_scanoptions=v;
	}

	//FIELD

	private String _BidsMeta_scanningsequence=null;

	/**
	 * @return Returns the bids_meta/ScanningSequence.
	 */
	public String getBidsMeta_scanningsequence(){
		return _BidsMeta_scanningsequence;
	}

	/**
	 * Sets the value for bids_meta/ScanningSequence.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_scanningsequence(String v){
		_BidsMeta_scanningsequence=v;
	}

	//FIELD

	private String _BidsMeta_sequencevariant=null;

	/**
	 * @return Returns the bids_meta/SequenceVariant.
	 */
	public String getBidsMeta_sequencevariant(){
		return _BidsMeta_sequencevariant;
	}

	/**
	 * Sets the value for bids_meta/SequenceVariant.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sequencevariant(String v){
		_BidsMeta_sequencevariant=v;
	}

	//FIELD

	private String _BidsMeta_seriesdescription=null;

	/**
	 * @return Returns the bids_meta/SeriesDescription.
	 */
	public String getBidsMeta_seriesdescription(){
		return _BidsMeta_seriesdescription;
	}

	/**
	 * Sets the value for bids_meta/SeriesDescription.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_seriesdescription(String v){
		_BidsMeta_seriesdescription=v;
	}

	//FIELD

	private String _BidsMeta_softwareversions=null;

	/**
	 * @return Returns the bids_meta/SoftwareVersions.
	 */
	public String getBidsMeta_softwareversions(){
		return _BidsMeta_softwareversions;
	}

	/**
	 * Sets the value for bids_meta/SoftwareVersions.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_softwareversions(String v){
		_BidsMeta_softwareversions=v;
	}

	//FIELD

	private String _BidsMeta_stationsname=null;

	/**
	 * @return Returns the bids_meta/StationsName.
	 */
	public String getBidsMeta_stationsname(){
		return _BidsMeta_stationsname;
	}

	/**
	 * Sets the value for bids_meta/StationsName.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_stationsname(String v){
		_BidsMeta_stationsname=v;
	}

	//FIELD

	private String _BidsMeta_dataset=null;

	/**
	 * @return Returns the bids_meta/dataset.
	 */
	public String getBidsMeta_dataset(){
		return _BidsMeta_dataset;
	}

	/**
	 * Sets the value for bids_meta/dataset.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_dataset(String v){
		_BidsMeta_dataset=v;
	}

	//FIELD

	private String _BidsMeta_modalisty=null;

	/**
	 * @return Returns the bids_meta/Modalisty.
	 */
	public String getBidsMeta_modalisty(){
		return _BidsMeta_modalisty;
	}

	/**
	 * Sets the value for bids_meta/Modalisty.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_modalisty(String v){
		_BidsMeta_modalisty=v;
	}

	//FIELD

	private String _BidsMeta_subjectId=null;

	/**
	 * @return Returns the bids_meta/subject_id.
	 */
	public String getBidsMeta_subjectId(){
		return _BidsMeta_subjectId;
	}

	/**
	 * Sets the value for bids_meta/subject_id.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_subjectId(String v){
		_BidsMeta_subjectId=v;
	}

	//FIELD

	private Object _BidsMeta_reconmatrixpe=null;

	/**
	 * @return Returns the bids_meta/ReconMatrixPE.
	 */
	public Object getBidsMeta_reconmatrixpe(){
		return _BidsMeta_reconmatrixpe;
	}

	/**
	 * Sets the value for bids_meta/ReconMatrixPE.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_reconmatrixpe(Object v){
		_BidsMeta_reconmatrixpe=v;
	}

	//FIELD

	private Integer _BidsMeta_sessionId=null;

	/**
	 * @return Returns the bids_meta/session_id.
	 */
	public Integer getBidsMeta_sessionId(){
		return _BidsMeta_sessionId;
	}

	/**
	 * Sets the value for template:mriqcCollection/bids_meta/session_id.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sessionId(Integer v) {
		_BidsMeta_sessionId=v;
	}

	/**
	 * Sets the value for template:mriqcCollection/bids_meta/session_id.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sessionId(String v)  {
		_BidsMeta_sessionId=formatInteger(v);
	}

	//FIELD

	private Double _Cjv=null;

	/**
	 * @return Returns the cjv.
	 */
	public Double getCjv() {
		return _Cjv;
	}

	/**
	 * Sets the value for cjv.
	 * @param v Value to Set.
	 */
	public void setCjv(Double v){
		_Cjv=v;
	}

	/**
	 * Sets the value for cjv.
	 * @param v Value to Set.
	 */
	public void setCjv(String v)  {
		_Cjv=formatDouble(v);
	}

	//FIELD

	private Double _Cnr=null;

	/**
	 * @return Returns the cnr.
	 */
	public Double getCnr() {
		return _Cnr;
	}

	/**
	 * Sets the value for cnr.
	 * @param v Value to Set.
	 */
	public void setCnr(Double v){
		_Cnr=v;
	}

	/**
	 * Sets the value for cnr.
	 * @param v Value to Set.
	 */
	public void setCnr(String v)  {
		_Cnr=formatDouble(v);
	}

	//FIELD

	private Double _Efc=null;

	/**
	 * @return Returns the efc.
	 */
	public Double getEfc() {
		return _Efc;
	}

	/**
	 * Sets the value for efc.
	 * @param v Value to Set.
	 */
	public void setEfc(Double v){
		_Efc=v;
	}

	/**
	 * Sets the value for efc.
	 * @param v Value to Set.
	 */
	public void setEfc(String v)  {
		_Efc=formatDouble(v);
	}

	//FIELD

	private Double _Fbef=null;

	/**
	 * @return Returns the fbef.
	 */
	public Double getFbef() {
		return _Fbef;
	}

	/**
	 * Sets the value for fbef.
	 * @param v Value to Set.
	 */
	public void setFbef(Double v){
		_Fbef=v;
	}

	/**
	 * Sets the value for fbef.
	 * @param v Value to Set.
	 */
	public void setFbef(String v)  {
		_Fbef=formatDouble(v);
	}

	//FIELD

	private Double _FwhmAvg=null;

	/**
	 * @return Returns the fwhm_avg.
	 */
	public Double getFwhmAvg() {
		return _FwhmAvg;
	}

	/**
	 * Sets the value for fwhm_avg.
	 * @param v Value to Set.
	 */
	public void setFwhmAvg(Double v){
		_FwhmAvg=v;
	}

	/**
	 * Sets the value for fwhm_avg.
	 * @param v Value to Set.
	 */
	public void setFwhmAvg(String v)  {
		_FwhmAvg=formatDouble(v);
	}

	//FIELD

	private Double _FwhmX=null;

	/**
	 * @return Returns the fwhm_x.
	 */
	public Double getFwhmX() {
		return _FwhmX;
	}

	/**
	 * Sets the value for fwhm_x.
	 * @param v Value to Set.
	 */
	public void setFwhmX(Double v){
		_FwhmX=v;
	}

	/**
	 * Sets the value for fwhm_x.
	 * @param v Value to Set.
	 */
	public void setFwhmX(String v)  {
		_FwhmX=formatDouble(v);
	}

	//FIELD

	private Double _FwhmY=null;

	/**
	 * @return Returns the fwhm_y.
	 */
	public Double getFwhmY() {
		return _FwhmY;
	}

	/**
	 * Sets the value for fwhm_y.
	 * @param v Value to Set.
	 */
	public void setFwhmY(Double v){
		_FwhmY=v;
	}

	/**
	 * Sets the value for fwhm_y.
	 * @param v Value to Set.
	 */
	public void setFwhmY(String v)  {
		_FwhmY=formatDouble(v);
	}

	//FIELD

	private Double _FwhmZ=null;

	/**
	 * @return Returns the fwhm_z.
	 */
	public Double getFwhmZ() {
		return _FwhmZ;
	}

	/**
	 * Sets the value for fwhm_z.
	 * @param v Value to Set.
	 */
	public void setFwhmZ(Double v){
		_FwhmZ=v;
	}

	/**
	 * Sets the value for fwhm_z.
	 * @param v Value to Set.
	 */
	public void setFwhmZ(String v)  {
		_FwhmZ=formatDouble(v);
	}

	//FIELD

	private Double _IcvsCsf=null;

	/**
	 * @return Returns the icvs_csf.
	 */
	public Double getIcvsCsf() {
		return _IcvsCsf;
	}

	/**
	 * Sets the value for icvs_csf.
	 * @param v Value to Set.
	 */
	public void setIcvsCsf(Double v){
		_IcvsCsf=v;
	}

	/**
	 * Sets the value for icvs_csf.
	 * @param v Value to Set.
	 */
	public void setIcvsCsf(String v)  {
		_IcvsCsf=formatDouble(v);
	}

	//FIELD

	private Double _IcvsGm=null;

	/**
	 * @return Returns the icvs_gm.
	 */
	public Double getIcvsGm() {
		return _IcvsGm;
	}

	/**
	 * Sets the value for icvs_gm.
	 * @param v Value to Set.
	 */
	public void setIcvsGm(Double v){
		_IcvsGm=v;
	}

	/**
	 * Sets the value for icvs_gm.
	 * @param v Value to Set.
	 */
	public void setIcvsGm(String v)  {
		_IcvsGm=formatDouble(v);
	}

	//FIELD

	private Double _IcvsWm=null;

	/**
	 * @return Returns the icvs_wm.
	 */
	public Double getIcvsWm() {
		return _IcvsWm;
	}

	/**
	 * Sets the value for icvs_wm.
	 * @param v Value to Set.
	 */
	public void setIcvsWm(Double v){
		_IcvsWm=v;
	}

	/**
	 * Sets the value for icvs_wm.
	 * @param v Value to Set.
	 */
	public void setIcvsWm(String v)  {
		_IcvsWm=formatDouble(v);
	}

	//FIELD

	private Double _InuMed=null;

	/**
	 * @return Returns the inu_med.
	 */
	public Double getInuMed() {
		return _InuMed;
	}

	/**
	 * Sets the value for inu_med.
	 * @param v Value to Set.
	 */
	public void setInuMed(Double v){
		_InuMed=v;
	}

	/**
	 * Sets the value for inu_med.
	 * @param v Value to Set.
	 */
	public void setInuMed(String v)  {
		_InuMed=formatDouble(v);
	}

	//FIELD

	private Double _InuRange=null;

	/**
	 * @return Returns the inu_range.
	 */
	public Double getInuRange() {
		return _InuRange;
	}

	/**
	 * Sets the value for inu_range.
	 * @param v Value to Set.
	 */
	public void setInuRange(Double v){
		_InuRange=v;
	}

	/**
	 * Sets the value for inu_range.
	 * @param v Value to Set.
	 */
	public void setInuRange(String v)  {
		_InuRange=formatDouble(v);
	}

	//FIELD

	private Double _Qi1=null;

	/**
	 * @return Returns the qi_1.
	 */
	public Double getQi1() {
		return _Qi1;
	}

	/**
	 * Sets the value for qi_1.
	 * @param v Value to Set.
	 */
	public void setQi1(Double v){
		_Qi1=v;
	}

	/**
	 * Sets the value for qi_1.
	 * @param v Value to Set.
	 */
	public void setQi1(String v)  {
		_Qi1=formatDouble(v);
	}

	//FIELD

	private Double _Qi2=null;

	/**
	 * @return Returns the qi_2.
	 */
	public Double getQi2() {
		return _Qi2;
	}

	/**
	 * Sets the value for qi_2.
	 * @param v Value to Set.
	 */
	public void setQi2(Double v){
		_Qi2=v;
	}

	/**
	 * Sets the value for qi_2.
	 * @param v Value to Set.
	 */
	public void setQi2(String v)  {
		_Qi2=formatDouble(v);
	}

	//FIELD

	private Double _RpveCsf=null;

	/**
	 * @return Returns the rpve_csf.
	 */
	public Double getRpveCsf() {
		return _RpveCsf;
	}

	/**
	 * Sets the value for rpve_csf.
	 * @param v Value to Set.
	 */
	public void setRpveCsf(Double v){
		_RpveCsf=v;
	}

	/**
	 * Sets the value for rpve_csf.
	 * @param v Value to Set.
	 */
	public void setRpveCsf(String v)  {
		_RpveCsf=formatDouble(v);
	}

	//FIELD

	private Double _RpveGm=null;

	/**
	 * @return Returns the rpve_gm.
	 */
	public Double getRpveGm() {
		return _RpveGm;
	}

	/**
	 * Sets the value for rpve_gm.
	 * @param v Value to Set.
	 */
	public void setRpveGm(Double v){
		_RpveGm=v;
	}

	/**
	 * Sets the value for rpve_gm.
	 * @param v Value to Set.
	 */
	public void setRpveGm(String v)  {
		_RpveGm=formatDouble(v);
	}

	//FIELD

	private Double _RpveWm=null;

	/**
	 * @return Returns the rpve_wm.
	 */
	public Double getRpveWm() {
		return _RpveWm;
	}

	/**
	 * Sets the value for rpve_wm.
	 * @param v Value to Set.
	 */
	public void setRpveWm(Double v){
		_RpveWm=v;
	}

	/**
	 * Sets the value for rpve_wm.
	 * @param v Value to Set.
	 */
	public void setRpveWm(String v)  {
		_RpveWm=formatDouble(v);
	}

	//FIELD

	private Double _SizeX=null;

	/**
	 * @return Returns the size_x.
	 */
	public Double getSizeX() {
		return _SizeX;
	}

	/**
	 * Sets the value for size_x.
	 * @param v Value to Set.
	 */
	public void setSizeX(Double v){
		_SizeX=v;
	}

	/**
	 * Sets the value for size_x.
	 * @param v Value to Set.
	 */
	public void setSizeX(String v)  {
		_SizeX=formatDouble(v);
	}

	//FIELD

	private Double _SizeY=null;

	/**
	 * @return Returns the size_y.
	 */
	public Double getSizeY() {
		return _SizeY;
	}

	/**
	 * Sets the value for size_y.
	 * @param v Value to Set.
	 */
	public void setSizeY(Double v){
		_SizeY=v;
	}

	/**
	 * Sets the value for size_y.
	 * @param v Value to Set.
	 */
	public void setSizeY(String v)  {
		_SizeY=formatDouble(v);
	}

	//FIELD

	private Double _SizeZ=null;

	/**
	 * @return Returns the size_z.
	 */
	public Double getSizeZ() {
		return _SizeZ;
	}

	/**
	 * Sets the value for size_z.
	 * @param v Value to Set.
	 */
	public void setSizeZ(Double v){
		_SizeZ=v;
	}

	/**
	 * Sets the value for size_z.
	 * @param v Value to Set.
	 */
	public void setSizeZ(String v)  {
		_SizeZ=formatDouble(v);
	}

	//FIELD

	private Double _SnrCsf=null;

	/**
	 * @return Returns the snr_csf.
	 */
	public Double getSnrCsf() {
		return _SnrCsf;
	}

	/**
	 * Sets the value for snr_csf.
	 * @param v Value to Set.
	 */
	public void setSnrCsf(Double v){
		_SnrCsf=v;
	}

	/**
	 * Sets the value for snr_csf.
	 * @param v Value to Set.
	 */
	public void setSnrCsf(String v)  {
		_SnrCsf=formatDouble(v);
	}

	//FIELD

	private Double _SnrWm=null;

	/**
	 * @return Returns the snr_wm.
	 */
	public Double getSnrWm() {
		return _SnrWm;
	}

	/**
	 * Sets the value for snr_wm.
	 * @param v Value to Set.
	 */
	public void setSnrWm(Double v){
		_SnrWm=v;
	}

	/**
	 * Sets the value for snr_wm.
	 * @param v Value to Set.
	 */
	public void setSnrWm(String v)  {
		_SnrWm=formatDouble(v);
	}

	//FIELD

	private Double _SnrGm=null;

	/**
	 * @return Returns the snr_gm.
	 */
	public Double getSnrGm() {
		return _SnrGm;
	}

	/**
	 * Sets the value for snr_gm.
	 * @param v Value to Set.
	 */
	public void setSnrGm(Double v){
		_SnrGm=v;
	}

	/**
	 * Sets the value for snr_gm.
	 * @param v Value to Set.
	 */
	public void setSnrGm(String v)  {
		_SnrGm=formatDouble(v);
	}

	//FIELD

	private Double _SnrTotal=null;

	/**
	 * @return Returns the snr_total.
	 */
	public Double getSnrTotal() {
		return _SnrTotal;
	}

	/**
	 * Sets the value for snr_total.
	 * @param v Value to Set.
	 */
	public void setSnrTotal(Double v){
		_SnrTotal=v;
	}

	/**
	 * Sets the value for snr_total.
	 * @param v Value to Set.
	 */
	public void setSnrTotal(String v)  {
		_SnrTotal=formatDouble(v);
	}

	//FIELD

	private Double _SnrdCsf=null;

	/**
	 * @return Returns the snrd_csf.
	 */
	public Double getSnrdCsf() {
		return _SnrdCsf;
	}

	/**
	 * Sets the value for snrd_csf.
	 * @param v Value to Set.
	 */
	public void setSnrdCsf(Double v){
		_SnrdCsf=v;
	}

	/**
	 * Sets the value for snrd_csf.
	 * @param v Value to Set.
	 */
	public void setSnrdCsf(String v)  {
		_SnrdCsf=formatDouble(v);
	}

	//FIELD

	private Double _SnrdWm=null;

	/**
	 * @return Returns the snrd_wm.
	 */
	public Double getSnrdWm() {
		return _SnrdWm;
	}

	/**
	 * Sets the value for snrd_wm.
	 * @param v Value to Set.
	 */
	public void setSnrdWm(Double v){
		_SnrdWm=v;
	}

	/**
	 * Sets the value for snrd_wm.
	 * @param v Value to Set.
	 */
	public void setSnrdWm(String v)  {
		_SnrdWm=formatDouble(v);
	}

	//FIELD

	private Double _SnrdGm=null;

	/**
	 * @return Returns the snrd_gm.
	 */
	public Double getSnrdGm() {
		return _SnrdGm;
	}

	/**
	 * Sets the value for snrd_gm.
	 * @param v Value to Set.
	 */
	public void setSnrdGm(Double v){
		_SnrdGm=v;
	}

	/**
	 * Sets the value for snrd_gm.
	 * @param v Value to Set.
	 */
	public void setSnrdGm(String v)  {
		_SnrdGm=formatDouble(v);
	}

	//FIELD

	private Double _SnrdTotal=null;

	/**
	 * @return Returns the snrd_total.
	 */
	public Double getSnrdTotal() {
		return _SnrdTotal;
	}

	/**
	 * Sets the value for snrd_total.
	 * @param v Value to Set.
	 */
	public void setSnrdTotal(Double v){
		_SnrdTotal=v;
	}

	/**
	 * Sets the value for snrd_total.
	 * @param v Value to Set.
	 */
	public void setSnrdTotal(String v)  {
		_SnrdTotal=formatDouble(v);
	}

	//FIELD

	private Double _SpacingX=null;

	/**
	 * @return Returns the spacing_x.
	 */
	public Double getSpacingX() {
		return _SpacingX;
	}

	/**
	 * Sets the value for spacing_x.
	 * @param v Value to Set.
	 */
	public void setSpacingX(Double v){
		_SpacingX=v;
	}

	/**
	 * Sets the value for spacing_x.
	 * @param v Value to Set.
	 */
	public void setSpacingX(String v)  {
		_SpacingX=formatDouble(v);
	}

	//FIELD

	private Double _SpacingY=null;

	/**
	 * @return Returns the spacing_y.
	 */
	public Double getSpacingY() {
		return _SpacingY;
	}

	/**
	 * Sets the value for spacing_y.
	 * @param v Value to Set.
	 */
	public void setSpacingY(Double v){
		_SpacingY=v;
	}

	/**
	 * Sets the value for spacing_y.
	 * @param v Value to Set.
	 */
	public void setSpacingY(String v)  {
		_SpacingY=formatDouble(v);
	}

	//FIELD

	private Double _SpacingZ=null;

	/**
	 * @return Returns the spacing_z.
	 */
	public Double getSpacingZ() {
		return _SpacingZ;
	}

	/**
	 * Sets the value for spacing_z.
	 * @param v Value to Set.
	 */
	public void setSpacingZ(Double v){
		_SpacingZ=v;
	}

	/**
	 * Sets the value for spacing_z.
	 * @param v Value to Set.
	 */
	public void setSpacingZ(String v)  {
		_SpacingZ=formatDouble(v);
	}

	//FIELD

	private Double _SummaryBgK=null;

	/**
	 * @return Returns the summary_bg_k.
	 */
	public Double getSummaryBgK() {
		return _SummaryBgK;
	}

	/**
	 * Sets the value for summary_bg_k.
	 * @param v Value to Set.
	 */
	public void setSummaryBgK(Double v){
		_SummaryBgK=v;
	}

	/**
	 * Sets the value for summary_bg_k.
	 * @param v Value to Set.
	 */
	public void setSummaryBgK(String v)  {
		_SummaryBgK=formatDouble(v);
	}

	//FIELD

	private Double _SummaryBgMad=null;

	/**
	 * @return Returns the summary_bg_mad.
	 */
	public Double getSummaryBgMad() {
		return _SummaryBgMad;
	}

	/**
	 * Sets the value for summary_bg_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMad(Double v){
		_SummaryBgMad=v;
	}

	/**
	 * Sets the value for summary_bg_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMad(String v)  {
		_SummaryBgMad=formatDouble(v);
	}

	//FIELD

	private Double _SummaryBgMean=null;

	/**
	 * @return Returns the summary_bg_mean.
	 */
	public Double getSummaryBgMean() {
		return _SummaryBgMean;
	}

	/**
	 * Sets the value for summary_bg_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMean(Double v){
		_SummaryBgMean=v;
	}

	/**
	 * Sets the value for summary_bg_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMean(String v)  {
		_SummaryBgMean=formatDouble(v);
	}

	//FIELD

	private Double _SummaryBgMedian=null;

	/**
	 * @return Returns the summary_bg_median.
	 */
	public Double getSummaryBgMedian() {
		return _SummaryBgMedian;
	}

	/**
	 * Sets the value for summary_bg_median.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMedian(Double v){
		_SummaryBgMedian=v;
	}

	/**
	 * Sets the value for summary_bg_median.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMedian(String v)  {
		_SummaryBgMedian=formatDouble(v);
	}

	//FIELD

	private Double _SummaryBgN=null;

	/**
	 * @return Returns the summary_bg_n.
	 */
	public Double getSummaryBgN() {
		return _SummaryBgN;
	}

	/**
	 * Sets the value for summary_bg_n.
	 * @param v Value to Set.
	 */
	public void setSummaryBgN(Double v){
		_SummaryBgN=v;
	}

	/**
	 * Sets the value for summary_bg_n.
	 * @param v Value to Set.
	 */
	public void setSummaryBgN(String v)  {
		_SummaryBgN=formatDouble(v);
	}

	//FIELD

	private Double _SummaryBgP05=null;

	/**
	 * @return Returns the summary_bg_p05.
	 */
	public Double getSummaryBgP05() {
		return _SummaryBgP05;
	}

	/**
	 * Sets the value for summary_bg_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryBgP05(Double v){
		_SummaryBgP05=v;
	}

	/**
	 * Sets the value for summary_bg_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryBgP05(String v)  {
		_SummaryBgP05=formatDouble(v);
	}

	//FIELD

	private Double _SummaryBgP95=null;

	/**
	 * @return Returns the summary_bg_p95.
	 */
	public Double getSummaryBgP95() {
		return _SummaryBgP95;
	}

	/**
	 * Sets the value for summary_bg_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryBgP95(Double v){
		_SummaryBgP95=v;
	}

	/**
	 * Sets the value for summary_bg_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryBgP95(String v)  {
		_SummaryBgP95=formatDouble(v);
	}

	//FIELD

	private Double _SummaryBgStdv=null;

	/**
	 * @return Returns the summary_bg_stdv.
	 */
	public Double getSummaryBgStdv() {
		return _SummaryBgStdv;
	}

	/**
	 * Sets the value for summary_bg_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryBgStdv(Double v){
		_SummaryBgStdv=v;
	}

	/**
	 * Sets the value for summary_bg_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryBgStdv(String v)  {
		_SummaryBgStdv=formatDouble(v);
	}

	//FIELD

	private Double _SummaryCsfK=null;

	/**
	 * @return Returns the summary_csf_k.
	 */
	public Double getSummaryCsfK() {
		return _SummaryCsfK;
	}

	/**
	 * Sets the value for summary_csf_k.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfK(Double v){
		_SummaryCsfK=v;
	}

	/**
	 * Sets the value for summary_csf_k.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfK(String v)  {
		_SummaryCsfK=formatDouble(v);
	}

	//FIELD

	private Double _SummaryCsfMad=null;

	/**
	 * @return Returns the summary_csf_mad.
	 */
	public Double getSummaryCsfMad() {
		return _SummaryCsfMad;
	}

	/**
	 * Sets the value for summary_csf_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMad(Double v){
		_SummaryCsfMad=v;
	}

	/**
	 * Sets the value for summary_csf_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMad(String v)  {
		_SummaryCsfMad=formatDouble(v);
	}

	//FIELD

	private Double _SummaryCsfMean=null;

	/**
	 * @return Returns the summary_csf_mean.
	 */
	public Double getSummaryCsfMean() {
		return _SummaryCsfMean;
	}

	/**
	 * Sets the value for summary_csf_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMean(Double v){
		_SummaryCsfMean=v;
	}

	/**
	 * Sets the value for summary_csf_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMean(String v)  {
		_SummaryCsfMean=formatDouble(v);
	}

	//FIELD

	private Double _SummaryCsfMedian=null;

	/**
	 * @return Returns the summary_csf_median.
	 */
	public Double getSummaryCsfMedian() {
		return _SummaryCsfMedian;
	}

	/**
	 * Sets the value for summary_csf_median.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMedian(Double v){
		_SummaryCsfMedian=v;
	}

	/**
	 * Sets the value for summary_csf_median.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMedian(String v)  {
		_SummaryCsfMedian=formatDouble(v);
	}

	//FIELD

	private Double _SummaryCsfN=null;

	/**
	 * @return Returns the summary_csf_n.
	 */
	public Double getSummaryCsfN() {
		return _SummaryCsfN;
	}

	/**
	 * Sets the value for summary_csf_n.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfN(Double v){
		_SummaryCsfN=v;
	}

	/**
	 * Sets the value for summary_csf_n.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfN(String v)  {
		_SummaryCsfN=formatDouble(v);
	}

	//FIELD

	private Double _SummaryCsfP05=null;

	/**
	 * @return Returns the summary_csf_p05.
	 */
	public Double getSummaryCsfP05() {
		return _SummaryCsfP05;
	}

	/**
	 * Sets the value for summary_csf_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfP05(Double v){
		_SummaryCsfP05=v;
	}

	/**
	 * Sets the value for summary_csf_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfP05(String v)  {
		_SummaryCsfP05=formatDouble(v);
	}

	//FIELD

	private Double _SummaryCsfP95=null;

	/**
	 * @return Returns the summary_csf_p95.
	 */
	public Double getSummaryCsfP95() {
		return _SummaryCsfP95;
	}

	/**
	 * Sets the value for summary_csf_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfP95(Double v){
		_SummaryCsfP95=v;
	}

	/**
	 * Sets the value for summary_csf_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfP95(String v)  {
		_SummaryCsfP95=formatDouble(v);
	}

	//FIELD

	private Double _SummaryCsfStdv=null;

	/**
	 * @return Returns the summary_csf_stdv.
	 */
	public Double getSummaryCsfStdv() {
		return _SummaryCsfStdv;
	}

	/**
	 * Sets the value for summary_csf_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfStdv(Double v){
		_SummaryCsfStdv=v;
	}

	/**
	 * Sets the value for summary_csf_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfStdv(String v)  {
		_SummaryCsfStdv=formatDouble(v);
	}

	//FIELD

	private Double _SummaryGmK=null;

	/**
	 * @return Returns the summary_gm_k.
	 */
	public Double getSummaryGmK() {
		return _SummaryGmK;
	}

	/**
	 * Sets the value for summary_gm_k.
	 * @param v Value to Set.
	 */
	public void setSummaryGmK(Double v){
		_SummaryGmK=v;
	}

	/**
	 * Sets the value for summary_gm_k.
	 * @param v Value to Set.
	 */
	public void setSummaryGmK(String v)  {
		_SummaryGmK=formatDouble(v);
	}

	//FIELD

	private Double _SummaryGmMad=null;

	/**
	 * @return Returns the summary_gm_mad.
	 */
	public Double getSummaryGmMad() {
		return _SummaryGmMad;
	}

	/**
	 * Sets the value for summary_gm_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMad(Double v){
		_SummaryGmMad=v;
	}

	/**
	 * Sets the value for summary_gm_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMad(String v)  {
		_SummaryGmMad=formatDouble(v);
	}

	//FIELD

	private Double _SummaryGmMean=null;

	/**
	 * @return Returns the summary_gm_mean.
	 */
	public Double getSummaryGmMean() {
		return _SummaryGmMean;
	}

	/**
	 * Sets the value for summary_gm_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMean(Double v){
		_SummaryGmMean=v;
	}

	/**
	 * Sets the value for summary_gm_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMean(String v)  {
		_SummaryGmMean=formatDouble(v);
	}

	//FIELD

	private Double _SummaryGmMedian=null;

	/**
	 * @return Returns the summary_gm_median.
	 */
	public Double getSummaryGmMedian() {
		return _SummaryGmMedian;
	}

	/**
	 * Sets the value for summary_gm_median.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMedian(Double v){
		_SummaryGmMedian=v;
	}

	/**
	 * Sets the value for summary_gm_median.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMedian(String v)  {
		_SummaryGmMedian=formatDouble(v);
	}

	//FIELD

	private Double _SummaryGmN=null;

	/**
	 * @return Returns the summary_gm_n.
	 */
	public Double getSummaryGmN() {
		return _SummaryGmN;
	}

	/**
	 * Sets the value for summary_gm_n.
	 * @param v Value to Set.
	 */
	public void setSummaryGmN(Double v){
		_SummaryGmN=v;
	}

	/**
	 * Sets the value for summary_gm_n.
	 * @param v Value to Set.
	 */
	public void setSummaryGmN(String v)  {
		_SummaryGmN=formatDouble(v);
	}

	//FIELD

	private Double _SummaryGmP05=null;

	/**
	 * @return Returns the summary_gm_p05.
	 */
	public Double getSummaryGmP05() {
		return _SummaryGmP05;
	}

	/**
	 * Sets the value for summary_gm_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryGmP05(Double v){
		_SummaryGmP05=v;
	}

	/**
	 * Sets the value for summary_gm_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryGmP05(String v)  {
		_SummaryGmP05=formatDouble(v);
	}

	//FIELD

	private Double _SummaryGmP95=null;

	/**
	 * @return Returns the summary_gm_p95.
	 */
	public Double getSummaryGmP95() {
		return _SummaryGmP95;
	}

	/**
	 * Sets the value for summary_gm_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryGmP95(Double v){
		_SummaryGmP95=v;
	}

	/**
	 * Sets the value for summary_gm_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryGmP95(String v)  {
		_SummaryGmP95=formatDouble(v);
	}

	//FIELD

	private Double _SummaryGmStdv=null;

	/**
	 * @return Returns the summary_gm_stdv.
	 */
	public Double getSummaryGmStdv() {
		return _SummaryGmStdv;
	}

	/**
	 * Sets the value for summary_gm_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryGmStdv(Double v){
		_SummaryGmStdv=v;
	}

	/**
	 * Sets the value for summary_gm_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryGmStdv(String v)  {
		_SummaryGmStdv=formatDouble(v);
	}

	//FIELD

	private Double _SummaryWmK=null;

	/**
	 * @return Returns the summary_wm_k.
	 */
	public Double getSummaryWmK() {
		return _SummaryWmK;
	}

	/**
	 * Sets the value for summary_wm_k.
	 * @param v Value to Set.
	 */
	public void setSummaryWmK(Double v){
		_SummaryWmK=v;
	}

	/**
	 * Sets the value for summary_wm_k.
	 * @param v Value to Set.
	 */
	public void setSummaryWmK(String v)  {
		_SummaryWmK=formatDouble(v);
	}

	//FIELD

	private Double _SummaryWmMad=null;

	/**
	 * @return Returns the summary_wm_mad.
	 */
	public Double getSummaryWmMad() {
		return _SummaryWmMad;
	}

	/**
	 * Sets the value for summary_wm_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMad(Double v){
		_SummaryWmMad=v;
	}

	/**
	 * Sets the value for summary_wm_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMad(String v)  {
		_SummaryWmMad=formatDouble(v);
	}

	//FIELD

	private Double _SummaryWmMean=null;

	/**
	 * @return Returns the summary_wm_mean.
	 */
	public Double getSummaryWmMean() {
		return _SummaryWmMean;
	}

	/**
	 * Sets the value for summary_wm_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMean(Double v){
		_SummaryWmMean=v;
	}

	/**
	 * Sets the value for summary_wm_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMean(String v)  {
		_SummaryWmMean=formatDouble(v);
	}

	//FIELD

	private Double _SummaryWmMedian=null;

	/**
	 * @return Returns the summary_wm_median.
	 */
	public Double getSummaryWmMedian() {
		return _SummaryWmMedian;
	}

	/**
	 * Sets the value for summary_wm_median.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMedian(Double v){
		_SummaryWmMedian=v;
	}

	/**
	 * Sets the value for summary_wm_median.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMedian(String v)  {
		_SummaryWmMedian=formatDouble(v);
	}

	//FIELD

	private Double _SummaryWmN=null;

	/**
	 * @return Returns the summary_wm_n.
	 */
	public Double getSummaryWmN() {
		return _SummaryWmN;
	}

	/**
	 * Sets the value for summary_wm_n.
	 * @param v Value to Set.
	 */
	public void setSummaryWmN(Double v){
		_SummaryWmN=v;
	}

	/**
	 * Sets the value for summary_wm_n.
	 * @param v Value to Set.
	 */
	public void setSummaryWmN(String v)  {
		_SummaryWmN=formatDouble(v);
	}

	//FIELD

	private Double _SummaryWmP05=null;

	/**
	 * @return Returns the summary_wm_p05.
	 */
	public Double getSummaryWmP05() {
		return _SummaryWmP05;
	}

	/**
	 * Sets the value for summary_wm_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryWmP05(Double v){
		_SummaryWmP05=v;
	}

	/**
	 * Sets the value for summary_wm_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryWmP05(String v)  {
		_SummaryWmP05=formatDouble(v);
	}

	//FIELD

	private Double _SummaryWmP95=null;

	/**
	 * @return Returns the summary_wm_p95.
	 */
	public Double getSummaryWmP95() {
		return _SummaryWmP95;
	}

	/**
	 * Sets the value for summary_wm_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryWmP95(Double v){
		_SummaryWmP95=v;
	}

	/**
	 * Sets the value for summary_wm_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryWmP95(String v)  {
		_SummaryWmP95=formatDouble(v);
	}

	//FIELD

	private Double _SummaryWmStdv=null;

	/**
	 * @return Returns the summary_wm_stdv.
	 */
	public Double getSummaryWmStdv() {
		return _SummaryWmStdv;
	}

	/**
	 * Sets the value for summary_wm_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryWmStdv(Double v){
		_SummaryWmStdv=v;
	}

	/**
	 * Sets the value for summary_wm_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryWmStdv(String v)  {
		_SummaryWmStdv=formatDouble(v);
	}

	//FIELD

	private Double _TpmOverlapCsf=null;

	/**
	 * @return Returns the tpm_overlap_csf.
	 */
	public Double getTpmOverlapCsf() {
		return _TpmOverlapCsf;
	}

	/**
	 * Sets the value for tpm_overlap_csf.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapCsf(Double v){
		_TpmOverlapCsf=v;
	}

	/**
	 * Sets the value for tpm_overlap_csf.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapCsf(String v)  {
		_TpmOverlapCsf=formatDouble(v);
	}

	//FIELD

	private Double _TpmOverlapGm=null;

	/**
	 * @return Returns the tpm_overlap_gm.
	 */
	public Double getTpmOverlapGm() {
		return _TpmOverlapGm;
	}

	/**
	 * Sets the value for tpm_overlap_gm.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapGm(Double v){
		_TpmOverlapGm=v;
	}

	/**
	 * Sets the value for tpm_overlap_gm.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapGm(String v)  {
		_TpmOverlapGm=formatDouble(v);
	}

	//FIELD

	private Double _TpmOverlapWm=null;

	/**
	 * @return Returns the tpm_overlap_wm.
	 */
	public Double getTpmOverlapWm() {
		return _TpmOverlapWm;
	}

	/**
	 * Sets the value for tpm_overlap_wm.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapWm(Double v){
		_TpmOverlapWm=v;
	}

	/**
	 * Sets the value for tpm_overlap_wm.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapWm(String v)  {
		_TpmOverlapWm=formatDouble(v);
	}

	//FIELD

	private Double _Wm2max=null;

	/**
	 * @return Returns the wm2max.
	 */
	public Double getWm2max() {
		return _Wm2max;
	}

	/**
	 * Sets the value for wm2max.
	 * @param v Value to Set.
	 */
	public void setWm2max(Double v){
		_Wm2max=v;
	}

	/**
	 * Sets the value for wm2max.
	 * @param v Value to Set.
	 */
	public void setWm2max(String v)  {
		_Wm2max=formatDouble(v);
	}

	//FIELD

	private String _Provenance_md5sum=null;

	/**
	 * @return Returns the provenance/md5sum.
	 */
	public String getProvenance_md5sum(){
		return _Provenance_md5sum;
	}

	/**
	 * Sets the value for provenance/md5sum.
	 * @param v Value to Set.
	 */
	public void setProvenance_md5sum(String v){
		_Provenance_md5sum=v;
	}

	//FIELD

	private String _Provenance_settings=null;

	/**
	 * @return Returns the provenance/settings.
	 */
	public String getProvenance_settings(){
		return _Provenance_settings;
	}

	/**
	 * Sets the value for provenance/settings.
	 * @param v Value to Set.
	 */
	public void setProvenance_settings(String v){
		_Provenance_settings=v;
	}

	//FIELD

	private String _Provenance_software=null;

	/**
	 * @return Returns the provenance/software.
	 */
	public String getProvenance_software(){
		return _Provenance_software;
	}

	/**
	 * Sets the value for provenance/software.
	 * @param v Value to Set.
	 */
	public void setProvenance_software(String v){
		_Provenance_software=v;
	}

	//FIELD

	private String _Provenance_version=null;

	/**
	 * @return Returns the provenance/version.
	 */
	public String getProvenance_version(){
		return _Provenance_version;
	}

	/**
	 * Sets the value for provenance/version.
	 * @param v Value to Set.
	 */
	public void setProvenance_version(String v){
		_Provenance_version=v;
	}

	//FIELD

	private String _Provenance_warnings=null;

	/**
	 * @return Returns the provenance/warnings.
	 */
	public String getProvenance_warnings(){
		return _Provenance_warnings;
	}

	/**
	 * Sets the value for provenance/warnings.
	 * @param v Value to Set.
	 */
	public void setProvenance_warnings(String v){
		_Provenance_warnings=v;
	}

	//FIELD

	private String _Provenance_webapiPort=null;

	/**
	 * @return Returns the provenance/webapi_port.
	 */
	public String getProvenance_webapiPort(){
		return _Provenance_webapiPort;
	}

	/**
	 * Sets the value for provenance/webapi_port.
	 * @param v Value to Set.
	 */
	public void setProvenance_webapiPort(String v){
		_Provenance_webapiPort=v;
	}

	//FIELD

	private String _Provenance_webapiUrl=null;

	/**
	 * @return Returns the provenance/webapi_url.
	 */
	public String getProvenance_webapiUrl(){
		return _Provenance_webapiUrl;
	}

	/**
	 * Sets the value for provenance/webapi_url.
	 * @param v Value to Set.
	 */
	public void setProvenance_webapiUrl(String v){
		_Provenance_webapiUrl=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("bids_meta/AcquisitionsMatrixPE")){
			setBidsMeta_acquisitionsmatrixpe(v);
		}else if (xmlPath.equals("bids_meta/AcquisitionsNumber")){
			setBidsMeta_acquisitionsnumber(v);
		}else if (xmlPath.equals("bids_meta/AcquisitionsTime")){
			setBidsMeta_acquisitionstime(v);
		}else if (xmlPath.equals("bids_meta/BodyPartExamined")){
			setBidsMeta_bodypartexamined(v);
		}else if (xmlPath.equals("bids_meta/CoilString")){
			setBidsMeta_coilstring(v);
		}else if (xmlPath.equals("bids_meta/ConversionSoftware")){
			setBidsMeta_conversionsoftware(v);
		}else if (xmlPath.equals("bids_meta/ConversionSoftwareVersion")){
			setBidsMeta_conversionsoftwareversion(v);
		}else if (xmlPath.equals("bids_meta/DeviceSerioalNumber")){
			setBidsMeta_deviceserioalnumber(v);
		}else if (xmlPath.equals("bids_meta/EchoTime")){
			setBidsMeta_echotime(v);
		}else if (xmlPath.equals("bids_meta/EchoTrainLength")){
			setBidsMeta_echotrainlength(v);
		}else if (xmlPath.equals("bids_meta/FlipAngle")){
			setBidsMeta_flipangle(v);
		}else if (xmlPath.equals("bids_meta/ImageOrientationPatientDICOM")){
			setBidsMeta_imageorientationpatientdicom(v);
		}else if (xmlPath.equals("bids_meta/ImageType")){
			setBidsMeta_imagetype(v);
		}else if (xmlPath.equals("bids_meta/InPlanePhaseEncodingDirectionDICOM")){
			setBidsMeta_inplanephaseencodingdirectiondicom(v);
		}else if (xmlPath.equals("bids_meta/Modality")){
			setBidsMeta_modality(v);
		}else if (xmlPath.equals("bids_meta/ImagingFrequency")){
			setBidsMeta_imagingfrequency(v);
		}else if (xmlPath.equals("bids_meta/InversionTime")){
			setBidsMeta_inversiontime(v);
		}else if (xmlPath.equals("bids_meta/MRAcquisitionType")){
			setBidsMeta_mracquisitiontype(v);
		}else if (xmlPath.equals("bids_meta/MagneticFieldStrength")){
			setBidsMeta_magneticfieldstrength(v);
		}else if (xmlPath.equals("bids_meta/PercentPhaseFOV")){
			setBidsMeta_percentphasefov(v);
		}else if (xmlPath.equals("bids_meta/SeriesNumber")){
			setBidsMeta_seriesnumber(v);
		}else if (xmlPath.equals("bids_meta/SliceThickness")){
			setBidsMeta_slicethickness(v);
		}else if (xmlPath.equals("bids_meta/SpacingBetweenSlices")){
			setBidsMeta_spacingbetweenslices(v);
		}else if (xmlPath.equals("bids_meta/PartialFourier")){
			setBidsMeta_partialfourier(v);
		}else if (xmlPath.equals("bids_meta/PixelBandwidth")){
			setBidsMeta_pixelbandwidth(v);
		}else if (xmlPath.equals("bids_meta/RepetitionTime")){
			setBidsMeta_repetitiontime(v);
		}else if (xmlPath.equals("bids_meta/SAR")){
			setBidsMeta_sar(v);
		}else if (xmlPath.equals("bids_meta/PatientPosition")){
			setBidsMeta_patientposition(v);
		}else if (xmlPath.equals("bids_meta/PhaseEncodingAxis")){
			setBidsMeta_phaseencodingaxis(v);
		}else if (xmlPath.equals("bids_meta/ProtocolName")){
			setBidsMeta_protocolname(v);
		}else if (xmlPath.equals("bids_meta/ScanOptions")){
			setBidsMeta_scanoptions(v);
		}else if (xmlPath.equals("bids_meta/ScanningSequence")){
			setBidsMeta_scanningsequence(v);
		}else if (xmlPath.equals("bids_meta/SequenceVariant")){
			setBidsMeta_sequencevariant(v);
		}else if (xmlPath.equals("bids_meta/SeriesDescription")){
			setBidsMeta_seriesdescription(v);
		}else if (xmlPath.equals("bids_meta/SoftwareVersions")){
			setBidsMeta_softwareversions(v);
		}else if (xmlPath.equals("bids_meta/StationsName")){
			setBidsMeta_stationsname(v);
		}else if (xmlPath.equals("bids_meta/dataset")){
			setBidsMeta_dataset(v);
		}else if (xmlPath.equals("bids_meta/Modalisty")){
			setBidsMeta_modalisty(v);
		}else if (xmlPath.equals("bids_meta/subject_id")){
			setBidsMeta_subjectId(v);
		}else if (xmlPath.equals("bids_meta/ReconMatrixPE")){
			setBidsMeta_reconmatrixpe(v);
		}else if (xmlPath.equals("bids_meta/session_id")){
			setBidsMeta_sessionId(v);
		}else if (xmlPath.equals("cjv")){
			setCjv(v);
		}else if (xmlPath.equals("cnr")){
			setCnr(v);
		}else if (xmlPath.equals("efc")){
			setEfc(v);
		}else if (xmlPath.equals("fbef")){
			setFbef(v);
		}else if (xmlPath.equals("fwhm_avg")){
			setFwhmAvg(v);
		}else if (xmlPath.equals("fwhm_x")){
			setFwhmX(v);
		}else if (xmlPath.equals("fwhm_y")){
			setFwhmY(v);
		}else if (xmlPath.equals("fwhm_z")){
			setFwhmZ(v);
		}else if (xmlPath.equals("icvs_csf")){
			setIcvsCsf(v);
		}else if (xmlPath.equals("icvs_gm")){
			setIcvsGm(v);
		}else if (xmlPath.equals("icvs_wm")){
			setIcvsWm(v);
		}else if (xmlPath.equals("inu_med")){
			setInuMed(v);
		}else if (xmlPath.equals("inu_range")){
			setInuRange(v);
		}else if (xmlPath.equals("qi_1")){
			setQi1(v);
		}else if (xmlPath.equals("qi_2")){
			setQi2(v);
		}else if (xmlPath.equals("rpve_csf")){
			setRpveCsf(v);
		}else if (xmlPath.equals("rpve_gm")){
			setRpveGm(v);
		}else if (xmlPath.equals("rpve_wm")){
			setRpveWm(v);
		}else if (xmlPath.equals("size_x")){
			setSizeX(v);
		}else if (xmlPath.equals("size_y")){
			setSizeY(v);
		}else if (xmlPath.equals("size_z")){
			setSizeZ(v);
		}else if (xmlPath.equals("snr_csf")){
			setSnrCsf(v);
		}else if (xmlPath.equals("snr_wm")){
			setSnrWm(v);
		}else if (xmlPath.equals("snr_gm")){
			setSnrGm(v);
		}else if (xmlPath.equals("snr_total")){
			setSnrTotal(v);
		}else if (xmlPath.equals("snrd_csf")){
			setSnrdCsf(v);
		}else if (xmlPath.equals("snrd_wm")){
			setSnrdWm(v);
		}else if (xmlPath.equals("snrd_gm")){
			setSnrdGm(v);
		}else if (xmlPath.equals("snrd_total")){
			setSnrdTotal(v);
		}else if (xmlPath.equals("spacing_x")){
			setSpacingX(v);
		}else if (xmlPath.equals("spacing_y")){
			setSpacingY(v);
		}else if (xmlPath.equals("spacing_z")){
			setSpacingZ(v);
		}else if (xmlPath.equals("summary_bg_k")){
			setSummaryBgK(v);
		}else if (xmlPath.equals("summary_bg_mad")){
			setSummaryBgMad(v);
		}else if (xmlPath.equals("summary_bg_mean")){
			setSummaryBgMean(v);
		}else if (xmlPath.equals("summary_bg_median")){
			setSummaryBgMedian(v);
		}else if (xmlPath.equals("summary_bg_n")){
			setSummaryBgN(v);
		}else if (xmlPath.equals("summary_bg_p05")){
			setSummaryBgP05(v);
		}else if (xmlPath.equals("summary_bg_p95")){
			setSummaryBgP95(v);
		}else if (xmlPath.equals("summary_bg_stdv")){
			setSummaryBgStdv(v);
		}else if (xmlPath.equals("summary_csf_k")){
			setSummaryCsfK(v);
		}else if (xmlPath.equals("summary_csf_mad")){
			setSummaryCsfMad(v);
		}else if (xmlPath.equals("summary_csf_mean")){
			setSummaryCsfMean(v);
		}else if (xmlPath.equals("summary_csf_median")){
			setSummaryCsfMedian(v);
		}else if (xmlPath.equals("summary_csf_n")){
			setSummaryCsfN(v);
		}else if (xmlPath.equals("summary_csf_p05")){
			setSummaryCsfP05(v);
		}else if (xmlPath.equals("summary_csf_p95")){
			setSummaryCsfP95(v);
		}else if (xmlPath.equals("summary_csf_stdv")){
			setSummaryCsfStdv(v);
		}else if (xmlPath.equals("summary_gm_k")){
			setSummaryGmK(v);
		}else if (xmlPath.equals("summary_gm_mad")){
			setSummaryGmMad(v);
		}else if (xmlPath.equals("summary_gm_mean")){
			setSummaryGmMean(v);
		}else if (xmlPath.equals("summary_gm_median")){
			setSummaryGmMedian(v);
		}else if (xmlPath.equals("summary_gm_n")){
			setSummaryGmN(v);
		}else if (xmlPath.equals("summary_gm_p05")){
			setSummaryGmP05(v);
		}else if (xmlPath.equals("summary_gm_p95")){
			setSummaryGmP95(v);
		}else if (xmlPath.equals("summary_gm_stdv")){
			setSummaryGmStdv(v);
		}else if (xmlPath.equals("summary_wm_k")){
			setSummaryWmK(v);
		}else if (xmlPath.equals("summary_wm_mad")){
			setSummaryWmMad(v);
		}else if (xmlPath.equals("summary_wm_mean")){
			setSummaryWmMean(v);
		}else if (xmlPath.equals("summary_wm_median")){
			setSummaryWmMedian(v);
		}else if (xmlPath.equals("summary_wm_n")){
			setSummaryWmN(v);
		}else if (xmlPath.equals("summary_wm_p05")){
			setSummaryWmP05(v);
		}else if (xmlPath.equals("summary_wm_p95")){
			setSummaryWmP95(v);
		}else if (xmlPath.equals("summary_wm_stdv")){
			setSummaryWmStdv(v);
		}else if (xmlPath.equals("tpm_overlap_csf")){
			setTpmOverlapCsf(v);
		}else if (xmlPath.equals("tpm_overlap_gm")){
			setTpmOverlapGm(v);
		}else if (xmlPath.equals("tpm_overlap_wm")){
			setTpmOverlapWm(v);
		}else if (xmlPath.equals("wm2max")){
			setWm2max(v);
		}else if (xmlPath.equals("provenance/md5sum")){
			setProvenance_md5sum(v);
		}else if (xmlPath.equals("provenance/settings")){
			setProvenance_settings(v);
		}else if (xmlPath.equals("provenance/software")){
			setProvenance_software(v);
		}else if (xmlPath.equals("provenance/version")){
			setProvenance_version(v);
		}else if (xmlPath.equals("provenance/warnings")){
			setProvenance_warnings(v);
		}else if (xmlPath.equals("provenance/webapi_port")){
			setProvenance_webapiPort(v);
		}else if (xmlPath.equals("provenance/webapi_url")){
			setProvenance_webapiUrl(v);
		}
		else{
			super.setDataField(xmlPath,v);
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setReferenceField(String xmlPath,BaseElement v) throws BaseElement.UnknownFieldException{
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("bids_meta/AcquisitionsMatrixPE")){
			return getBidsMeta_acquisitionsmatrixpe();
		}else if (xmlPath.equals("bids_meta/AcquisitionsNumber")){
			return getBidsMeta_acquisitionsnumber();
		}else if (xmlPath.equals("bids_meta/AcquisitionsTime")){
			return getBidsMeta_acquisitionstime();
		}else if (xmlPath.equals("bids_meta/BodyPartExamined")){
			return getBidsMeta_bodypartexamined();
		}else if (xmlPath.equals("bids_meta/CoilString")){
			return getBidsMeta_coilstring();
		}else if (xmlPath.equals("bids_meta/ConversionSoftware")){
			return getBidsMeta_conversionsoftware();
		}else if (xmlPath.equals("bids_meta/ConversionSoftwareVersion")){
			return getBidsMeta_conversionsoftwareversion();
		}else if (xmlPath.equals("bids_meta/DeviceSerioalNumber")){
			return getBidsMeta_deviceserioalnumber();
		}else if (xmlPath.equals("bids_meta/EchoTime")){
			return getBidsMeta_echotime();
		}else if (xmlPath.equals("bids_meta/EchoTrainLength")){
			return getBidsMeta_echotrainlength();
		}else if (xmlPath.equals("bids_meta/FlipAngle")){
			return getBidsMeta_flipangle();
		}else if (xmlPath.equals("bids_meta/ImageOrientationPatientDICOM")){
			return getBidsMeta_imageorientationpatientdicom();
		}else if (xmlPath.equals("bids_meta/ImageType")){
			return getBidsMeta_imagetype();
		}else if (xmlPath.equals("bids_meta/InPlanePhaseEncodingDirectionDICOM")){
			return getBidsMeta_inplanephaseencodingdirectiondicom();
		}else if (xmlPath.equals("bids_meta/Modality")){
			return getBidsMeta_modality();
		}else if (xmlPath.equals("bids_meta/ImagingFrequency")){
			return getBidsMeta_imagingfrequency();
		}else if (xmlPath.equals("bids_meta/InversionTime")){
			return getBidsMeta_inversiontime();
		}else if (xmlPath.equals("bids_meta/MRAcquisitionType")){
			return getBidsMeta_mracquisitiontype();
		}else if (xmlPath.equals("bids_meta/MagneticFieldStrength")){
			return getBidsMeta_magneticfieldstrength();
		}else if (xmlPath.equals("bids_meta/PercentPhaseFOV")){
			return getBidsMeta_percentphasefov();
		}else if (xmlPath.equals("bids_meta/SeriesNumber")){
			return getBidsMeta_seriesnumber();
		}else if (xmlPath.equals("bids_meta/SliceThickness")){
			return getBidsMeta_slicethickness();
		}else if (xmlPath.equals("bids_meta/SpacingBetweenSlices")){
			return getBidsMeta_spacingbetweenslices();
		}else if (xmlPath.equals("bids_meta/PartialFourier")){
			return getBidsMeta_partialfourier();
		}else if (xmlPath.equals("bids_meta/PixelBandwidth")){
			return getBidsMeta_pixelbandwidth();
		}else if (xmlPath.equals("bids_meta/RepetitionTime")){
			return getBidsMeta_repetitiontime();
		}else if (xmlPath.equals("bids_meta/SAR")){
			return getBidsMeta_sar();
		}else if (xmlPath.equals("bids_meta/PatientPosition")){
			return getBidsMeta_patientposition();
		}else if (xmlPath.equals("bids_meta/PhaseEncodingAxis")){
			return getBidsMeta_phaseencodingaxis();
		}else if (xmlPath.equals("bids_meta/ProtocolName")){
			return getBidsMeta_protocolname();
		}else if (xmlPath.equals("bids_meta/ScanOptions")){
			return getBidsMeta_scanoptions();
		}else if (xmlPath.equals("bids_meta/ScanningSequence")){
			return getBidsMeta_scanningsequence();
		}else if (xmlPath.equals("bids_meta/SequenceVariant")){
			return getBidsMeta_sequencevariant();
		}else if (xmlPath.equals("bids_meta/SeriesDescription")){
			return getBidsMeta_seriesdescription();
		}else if (xmlPath.equals("bids_meta/SoftwareVersions")){
			return getBidsMeta_softwareversions();
		}else if (xmlPath.equals("bids_meta/StationsName")){
			return getBidsMeta_stationsname();
		}else if (xmlPath.equals("bids_meta/dataset")){
			return getBidsMeta_dataset();
		}else if (xmlPath.equals("bids_meta/Modalisty")){
			return getBidsMeta_modalisty();
		}else if (xmlPath.equals("bids_meta/subject_id")){
			return getBidsMeta_subjectId();
		}else if (xmlPath.equals("bids_meta/ReconMatrixPE")){
			return getBidsMeta_reconmatrixpe();
		}else if (xmlPath.equals("bids_meta/session_id")){
			return getBidsMeta_sessionId();
		}else if (xmlPath.equals("cjv")){
			return getCjv();
		}else if (xmlPath.equals("cnr")){
			return getCnr();
		}else if (xmlPath.equals("efc")){
			return getEfc();
		}else if (xmlPath.equals("fbef")){
			return getFbef();
		}else if (xmlPath.equals("fwhm_avg")){
			return getFwhmAvg();
		}else if (xmlPath.equals("fwhm_x")){
			return getFwhmX();
		}else if (xmlPath.equals("fwhm_y")){
			return getFwhmY();
		}else if (xmlPath.equals("fwhm_z")){
			return getFwhmZ();
		}else if (xmlPath.equals("icvs_csf")){
			return getIcvsCsf();
		}else if (xmlPath.equals("icvs_gm")){
			return getIcvsGm();
		}else if (xmlPath.equals("icvs_wm")){
			return getIcvsWm();
		}else if (xmlPath.equals("inu_med")){
			return getInuMed();
		}else if (xmlPath.equals("inu_range")){
			return getInuRange();
		}else if (xmlPath.equals("qi_1")){
			return getQi1();
		}else if (xmlPath.equals("qi_2")){
			return getQi2();
		}else if (xmlPath.equals("rpve_csf")){
			return getRpveCsf();
		}else if (xmlPath.equals("rpve_gm")){
			return getRpveGm();
		}else if (xmlPath.equals("rpve_wm")){
			return getRpveWm();
		}else if (xmlPath.equals("size_x")){
			return getSizeX();
		}else if (xmlPath.equals("size_y")){
			return getSizeY();
		}else if (xmlPath.equals("size_z")){
			return getSizeZ();
		}else if (xmlPath.equals("snr_csf")){
			return getSnrCsf();
		}else if (xmlPath.equals("snr_wm")){
			return getSnrWm();
		}else if (xmlPath.equals("snr_gm")){
			return getSnrGm();
		}else if (xmlPath.equals("snr_total")){
			return getSnrTotal();
		}else if (xmlPath.equals("snrd_csf")){
			return getSnrdCsf();
		}else if (xmlPath.equals("snrd_wm")){
			return getSnrdWm();
		}else if (xmlPath.equals("snrd_gm")){
			return getSnrdGm();
		}else if (xmlPath.equals("snrd_total")){
			return getSnrdTotal();
		}else if (xmlPath.equals("spacing_x")){
			return getSpacingX();
		}else if (xmlPath.equals("spacing_y")){
			return getSpacingY();
		}else if (xmlPath.equals("spacing_z")){
			return getSpacingZ();
		}else if (xmlPath.equals("summary_bg_k")){
			return getSummaryBgK();
		}else if (xmlPath.equals("summary_bg_mad")){
			return getSummaryBgMad();
		}else if (xmlPath.equals("summary_bg_mean")){
			return getSummaryBgMean();
		}else if (xmlPath.equals("summary_bg_median")){
			return getSummaryBgMedian();
		}else if (xmlPath.equals("summary_bg_n")){
			return getSummaryBgN();
		}else if (xmlPath.equals("summary_bg_p05")){
			return getSummaryBgP05();
		}else if (xmlPath.equals("summary_bg_p95")){
			return getSummaryBgP95();
		}else if (xmlPath.equals("summary_bg_stdv")){
			return getSummaryBgStdv();
		}else if (xmlPath.equals("summary_csf_k")){
			return getSummaryCsfK();
		}else if (xmlPath.equals("summary_csf_mad")){
			return getSummaryCsfMad();
		}else if (xmlPath.equals("summary_csf_mean")){
			return getSummaryCsfMean();
		}else if (xmlPath.equals("summary_csf_median")){
			return getSummaryCsfMedian();
		}else if (xmlPath.equals("summary_csf_n")){
			return getSummaryCsfN();
		}else if (xmlPath.equals("summary_csf_p05")){
			return getSummaryCsfP05();
		}else if (xmlPath.equals("summary_csf_p95")){
			return getSummaryCsfP95();
		}else if (xmlPath.equals("summary_csf_stdv")){
			return getSummaryCsfStdv();
		}else if (xmlPath.equals("summary_gm_k")){
			return getSummaryGmK();
		}else if (xmlPath.equals("summary_gm_mad")){
			return getSummaryGmMad();
		}else if (xmlPath.equals("summary_gm_mean")){
			return getSummaryGmMean();
		}else if (xmlPath.equals("summary_gm_median")){
			return getSummaryGmMedian();
		}else if (xmlPath.equals("summary_gm_n")){
			return getSummaryGmN();
		}else if (xmlPath.equals("summary_gm_p05")){
			return getSummaryGmP05();
		}else if (xmlPath.equals("summary_gm_p95")){
			return getSummaryGmP95();
		}else if (xmlPath.equals("summary_gm_stdv")){
			return getSummaryGmStdv();
		}else if (xmlPath.equals("summary_wm_k")){
			return getSummaryWmK();
		}else if (xmlPath.equals("summary_wm_mad")){
			return getSummaryWmMad();
		}else if (xmlPath.equals("summary_wm_mean")){
			return getSummaryWmMean();
		}else if (xmlPath.equals("summary_wm_median")){
			return getSummaryWmMedian();
		}else if (xmlPath.equals("summary_wm_n")){
			return getSummaryWmN();
		}else if (xmlPath.equals("summary_wm_p05")){
			return getSummaryWmP05();
		}else if (xmlPath.equals("summary_wm_p95")){
			return getSummaryWmP95();
		}else if (xmlPath.equals("summary_wm_stdv")){
			return getSummaryWmStdv();
		}else if (xmlPath.equals("tpm_overlap_csf")){
			return getTpmOverlapCsf();
		}else if (xmlPath.equals("tpm_overlap_gm")){
			return getTpmOverlapGm();
		}else if (xmlPath.equals("tpm_overlap_wm")){
			return getTpmOverlapWm();
		}else if (xmlPath.equals("wm2max")){
			return getWm2max();
		}else if (xmlPath.equals("provenance/md5sum")){
			return getProvenance_md5sum();
		}else if (xmlPath.equals("provenance/settings")){
			return getProvenance_settings();
		}else if (xmlPath.equals("provenance/software")){
			return getProvenance_software();
		}else if (xmlPath.equals("provenance/version")){
			return getProvenance_version();
		}else if (xmlPath.equals("provenance/warnings")){
			return getProvenance_warnings();
		}else if (xmlPath.equals("provenance/webapi_port")){
			return getProvenance_webapiPort();
		}else if (xmlPath.equals("provenance/webapi_url")){
			return getProvenance_webapiUrl();
		}
		else{
			return super.getDataFieldValue(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getReferenceField(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceField(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("bids_meta/AcquisitionsMatrixPE")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/AcquisitionsNumber")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/AcquisitionsTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/BodyPartExamined")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/CoilString")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ConversionSoftware")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ConversionSoftwareVersion")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/DeviceSerioalNumber")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/EchoTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/EchoTrainLength")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/FlipAngle")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ImageOrientationPatientDICOM")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ImageType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/InPlanePhaseEncodingDirectionDICOM")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/Modality")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ImagingFrequency")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/InversionTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/MRAcquisitionType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/MagneticFieldStrength")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/PercentPhaseFOV")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/SeriesNumber")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/SliceThickness")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/SpacingBetweenSlices")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/PartialFourier")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/PixelBandwidth")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/RepetitionTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/SAR")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/PatientPosition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/PhaseEncodingAxis")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ProtocolName")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ScanOptions")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ScanningSequence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/SequenceVariant")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/SeriesDescription")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/SoftwareVersions")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/StationsName")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/dataset")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/Modalisty")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/subject_id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/ReconMatrixPE")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bids_meta/session_id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("cjv")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("cnr")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("efc")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fbef")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fwhm_avg")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fwhm_x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fwhm_y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fwhm_z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("icvs_csf")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("icvs_gm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("icvs_wm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("inu_med")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("inu_range")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("qi_1")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("qi_2")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rpve_csf")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rpve_gm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rpve_wm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("size_x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("size_y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("size_z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snr_csf")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snr_wm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snr_gm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snr_total")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snrd_csf")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snrd_wm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snrd_gm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snrd_total")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("spacing_x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("spacing_y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("spacing_z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_bg_k")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_bg_mad")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_bg_mean")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_bg_median")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_bg_n")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_bg_p05")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_bg_p95")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_bg_stdv")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_csf_k")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_csf_mad")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_csf_mean")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_csf_median")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_csf_n")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_csf_p05")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_csf_p95")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_csf_stdv")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_gm_k")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_gm_mad")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_gm_mean")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_gm_median")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_gm_n")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_gm_p05")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_gm_p95")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_gm_stdv")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_wm_k")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_wm_mad")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_wm_mean")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_wm_median")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_wm_n")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_wm_p05")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_wm_p95")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary_wm_stdv")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tpm_overlap_csf")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tpm_overlap_gm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tpm_overlap_wm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("wm2max")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("provenance/md5sum")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("provenance/settings")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("provenance/software")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("provenance/version")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("provenance/warnings")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("provenance/webapi_port")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("provenance/webapi_url")){
			return BaseElement.field_data;
		}
		else{
			return super.getFieldType(xmlPath);
		}
	}

	/**
	 * Returns arraylist of all fields
	 */
	public ArrayList getAllFields() {
		ArrayList all_fields=new ArrayList();
		all_fields.add("bids_meta/AcquisitionsMatrixPE");
		all_fields.add("bids_meta/AcquisitionsNumber");
		all_fields.add("bids_meta/AcquisitionsTime");
		all_fields.add("bids_meta/BodyPartExamined");
		all_fields.add("bids_meta/CoilString");
		all_fields.add("bids_meta/ConversionSoftware");
		all_fields.add("bids_meta/ConversionSoftwareVersion");
		all_fields.add("bids_meta/DeviceSerioalNumber");
		all_fields.add("bids_meta/EchoTime");
		all_fields.add("bids_meta/EchoTrainLength");
		all_fields.add("bids_meta/FlipAngle");
		all_fields.add("bids_meta/ImageOrientationPatientDICOM");
		all_fields.add("bids_meta/ImageType");
		all_fields.add("bids_meta/InPlanePhaseEncodingDirectionDICOM");
		all_fields.add("bids_meta/Modality");
		all_fields.add("bids_meta/ImagingFrequency");
		all_fields.add("bids_meta/InversionTime");
		all_fields.add("bids_meta/MRAcquisitionType");
		all_fields.add("bids_meta/MagneticFieldStrength");
		all_fields.add("bids_meta/PercentPhaseFOV");
		all_fields.add("bids_meta/SeriesNumber");
		all_fields.add("bids_meta/SliceThickness");
		all_fields.add("bids_meta/SpacingBetweenSlices");
		all_fields.add("bids_meta/PartialFourier");
		all_fields.add("bids_meta/PixelBandwidth");
		all_fields.add("bids_meta/RepetitionTime");
		all_fields.add("bids_meta/SAR");
		all_fields.add("bids_meta/PatientPosition");
		all_fields.add("bids_meta/PhaseEncodingAxis");
		all_fields.add("bids_meta/ProtocolName");
		all_fields.add("bids_meta/ScanOptions");
		all_fields.add("bids_meta/ScanningSequence");
		all_fields.add("bids_meta/SequenceVariant");
		all_fields.add("bids_meta/SeriesDescription");
		all_fields.add("bids_meta/SoftwareVersions");
		all_fields.add("bids_meta/StationsName");
		all_fields.add("bids_meta/dataset");
		all_fields.add("bids_meta/Modalisty");
		all_fields.add("bids_meta/subject_id");
		all_fields.add("bids_meta/ReconMatrixPE");
		all_fields.add("bids_meta/session_id");
		all_fields.add("cjv");
		all_fields.add("cnr");
		all_fields.add("efc");
		all_fields.add("fbef");
		all_fields.add("fwhm_avg");
		all_fields.add("fwhm_x");
		all_fields.add("fwhm_y");
		all_fields.add("fwhm_z");
		all_fields.add("icvs_csf");
		all_fields.add("icvs_gm");
		all_fields.add("icvs_wm");
		all_fields.add("inu_med");
		all_fields.add("inu_range");
		all_fields.add("qi_1");
		all_fields.add("qi_2");
		all_fields.add("rpve_csf");
		all_fields.add("rpve_gm");
		all_fields.add("rpve_wm");
		all_fields.add("size_x");
		all_fields.add("size_y");
		all_fields.add("size_z");
		all_fields.add("snr_csf");
		all_fields.add("snr_wm");
		all_fields.add("snr_gm");
		all_fields.add("snr_total");
		all_fields.add("snrd_csf");
		all_fields.add("snrd_wm");
		all_fields.add("snrd_gm");
		all_fields.add("snrd_total");
		all_fields.add("spacing_x");
		all_fields.add("spacing_y");
		all_fields.add("spacing_z");
		all_fields.add("summary_bg_k");
		all_fields.add("summary_bg_mad");
		all_fields.add("summary_bg_mean");
		all_fields.add("summary_bg_median");
		all_fields.add("summary_bg_n");
		all_fields.add("summary_bg_p05");
		all_fields.add("summary_bg_p95");
		all_fields.add("summary_bg_stdv");
		all_fields.add("summary_csf_k");
		all_fields.add("summary_csf_mad");
		all_fields.add("summary_csf_mean");
		all_fields.add("summary_csf_median");
		all_fields.add("summary_csf_n");
		all_fields.add("summary_csf_p05");
		all_fields.add("summary_csf_p95");
		all_fields.add("summary_csf_stdv");
		all_fields.add("summary_gm_k");
		all_fields.add("summary_gm_mad");
		all_fields.add("summary_gm_mean");
		all_fields.add("summary_gm_median");
		all_fields.add("summary_gm_n");
		all_fields.add("summary_gm_p05");
		all_fields.add("summary_gm_p95");
		all_fields.add("summary_gm_stdv");
		all_fields.add("summary_wm_k");
		all_fields.add("summary_wm_mad");
		all_fields.add("summary_wm_mean");
		all_fields.add("summary_wm_median");
		all_fields.add("summary_wm_n");
		all_fields.add("summary_wm_p05");
		all_fields.add("summary_wm_p95");
		all_fields.add("summary_wm_stdv");
		all_fields.add("tpm_overlap_csf");
		all_fields.add("tpm_overlap_gm");
		all_fields.add("tpm_overlap_wm");
		all_fields.add("wm2max");
		all_fields.add("provenance/md5sum");
		all_fields.add("provenance/settings");
		all_fields.add("provenance/software");
		all_fields.add("provenance/version");
		all_fields.add("provenance/warnings");
		all_fields.add("provenance/webapi_port");
		all_fields.add("provenance/webapi_url");
		all_fields.addAll(super.getAllFields());
		return all_fields;
	}


	public String toString(){
		java.io.StringWriter sw = new java.io.StringWriter();
		try{this.toXML(sw,true);}catch(java.io.IOException e){}
		return sw.toString();
	}


	public void toXML(java.io.Writer writer,boolean prettyPrint) throws java.io.IOException{
		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.write("\n<template:mriqcCollection");
		TreeMap map = new TreeMap();
		map.putAll(getXMLAtts());
		map.put("xmlns:arc","http://nrg.wustl.edu/arc");
		map.put("xmlns:cat","http://nrg.wustl.edu/catalog");
		map.put("xmlns:pipe","http://nrg.wustl.edu/pipe");
		map.put("xmlns:prov","http://www.nbirn.net/prov");
		map.put("xmlns:scr","http://nrg.wustl.edu/scr");
		map.put("xmlns:template","http://nrg.wustl.edu/template");
		map.put("xmlns:val","http://nrg.wustl.edu/val");
		map.put("xmlns:wrk","http://nrg.wustl.edu/workflow");
		map.put("xmlns:xdat","http://nrg.wustl.edu/security");
		map.put("xmlns:xnat","http://nrg.wustl.edu/xnat");
		map.put("xmlns:xnat_a","http://nrg.wustl.edu/xnat_assessments");
		map.put("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
		int header = 0;
		if (prettyPrint)header++;
		writer.write(">");
		addXMLBody(writer,header);
		if (prettyPrint)header--;
		writer.write("\n</template:mriqcCollection>");
	}


	protected void addXMLAtts(java.io.Writer writer) throws java.io.IOException{
		TreeMap map = this.getXMLAtts();
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
	}


	protected TreeMap getXMLAtts() {
		TreeMap map = super.getXMLAtts();
		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM mriqcCollection -> imageAssessorData
			int child0=0;
			int att0=0;
			if(_BidsMeta_modalisty!=null)
			child0++;
			if(_BidsMeta_scanningsequence!=null)
			child0++;
			if(_BidsMeta_sequencevariant!=null)
			child0++;
			if(_BidsMeta_echotrainlength!=null)
			child0++;
			if(_BidsMeta_conversionsoftware!=null)
			child0++;
			if(_BidsMeta_patientposition!=null)
			child0++;
			if(_BidsMeta_stationsname!=null)
			child0++;
			if(_BidsMeta_modality!=null)
			child0++;
			if(_BidsMeta_acquisitionstime!=null)
			child0++;
			if(_BidsMeta_sar!=null)
			child0++;
			if(_BidsMeta_sessionId!=null)
			child0++;
			if(_BidsMeta_partialfourier!=null)
			child0++;
			if(_BidsMeta_coilstring!=null)
			child0++;
			if(_BidsMeta_subjectId!=null)
			child0++;
			if(_BidsMeta_conversionsoftwareversion!=null)
			child0++;
			if(_BidsMeta_phaseencodingaxis!=null)
			child0++;
			if(_BidsMeta_dataset!=null)
			child0++;
			if(_BidsMeta_acquisitionsmatrixpe!=null)
			child0++;
			if(_BidsMeta_percentphasefov!=null)
			child0++;
			if(_BidsMeta_repetitiontime!=null)
			child0++;
			if(_BidsMeta_protocolname!=null)
			child0++;
			if(_BidsMeta_imagetype!=null)
			child0++;
			if(_BidsMeta_echotime!=null)
			child0++;
			if(_BidsMeta_inplanephaseencodingdirectiondicom!=null)
			child0++;
			if(_BidsMeta_seriesnumber!=null)
			child0++;
			if(_BidsMeta_acquisitionsnumber!=null)
			child0++;
			if(_BidsMeta_pixelbandwidth!=null)
			child0++;
			if(_BidsMeta_slicethickness!=null)
			child0++;
			if(_BidsMeta_softwareversions!=null)
			child0++;
			if(_BidsMeta_deviceserioalnumber!=null)
			child0++;
			if(_BidsMeta_inversiontime!=null)
			child0++;
			if(_BidsMeta_imageorientationpatientdicom!=null)
			child0++;
			if(_BidsMeta_scanoptions!=null)
			child0++;
			if(_BidsMeta_bodypartexamined!=null)
			child0++;
			if(_BidsMeta_magneticfieldstrength!=null)
			child0++;
			if(_BidsMeta_seriesdescription!=null)
			child0++;
			if(_BidsMeta_flipangle!=null)
			child0++;
			if(_BidsMeta_spacingbetweenslices!=null)
			child0++;
			if(_BidsMeta_mracquisitiontype!=null)
			child0++;
			if(_BidsMeta_imagingfrequency!=null)
			child0++;
			if(_BidsMeta_reconmatrixpe!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<template:bids_meta");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_BidsMeta_acquisitionsmatrixpe!=null){
			writer.write("\n" + createHeader(header++) + "<template:AcquisitionsMatrixPE");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_acquisitionsmatrixpe,"short"));
			writer.write("</template:AcquisitionsMatrixPE>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:AcquisitionsMatrixPE");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_acquisitionsnumber!=null){
			writer.write("\n" + createHeader(header++) + "<template:AcquisitionsNumber");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_acquisitionsnumber,"byte"));
			writer.write("</template:AcquisitionsNumber>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:AcquisitionsNumber");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_acquisitionstime!=null){
			writer.write("\n" + createHeader(header++) + "<template:AcquisitionsTime");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_acquisitionstime,"time"));
			writer.write("</template:AcquisitionsTime>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:AcquisitionsTime");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_bodypartexamined!=null){
			writer.write("\n" + createHeader(header++) + "<template:BodyPartExamined");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_bodypartexamined,"string"));
			writer.write("</template:BodyPartExamined>");
			header--;
		}
		if (_BidsMeta_coilstring!=null){
			writer.write("\n" + createHeader(header++) + "<template:CoilString");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_coilstring,"string"));
			writer.write("</template:CoilString>");
			header--;
		}
		if (_BidsMeta_conversionsoftware!=null){
			writer.write("\n" + createHeader(header++) + "<template:ConversionSoftware");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_conversionsoftware,"string"));
			writer.write("</template:ConversionSoftware>");
			header--;
		}
		if (_BidsMeta_conversionsoftwareversion!=null){
			writer.write("\n" + createHeader(header++) + "<template:ConversionSoftwareVersion");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_conversionsoftwareversion,"string"));
			writer.write("</template:ConversionSoftwareVersion>");
			header--;
		}
		if (_BidsMeta_deviceserioalnumber!=null){
			writer.write("\n" + createHeader(header++) + "<template:DeviceSerioalNumber");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_deviceserioalnumber,"string"));
			writer.write("</template:DeviceSerioalNumber>");
			header--;
		}
		if (_BidsMeta_echotime!=null){
			writer.write("\n" + createHeader(header++) + "<template:EchoTime");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_echotime,"float"));
			writer.write("</template:EchoTime>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:EchoTime");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_echotrainlength!=null){
			writer.write("\n" + createHeader(header++) + "<template:EchoTrainLength");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_echotrainlength,"byte"));
			writer.write("</template:EchoTrainLength>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:EchoTrainLength");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_flipangle!=null){
			writer.write("\n" + createHeader(header++) + "<template:FlipAngle");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_flipangle,"byte"));
			writer.write("</template:FlipAngle>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:FlipAngle");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_imageorientationpatientdicom!=null){
			writer.write("\n" + createHeader(header++) + "<template:ImageOrientationPatientDICOM");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_imageorientationpatientdicom,"string"));
			writer.write("</template:ImageOrientationPatientDICOM>");
			header--;
		}
		if (_BidsMeta_imagetype!=null){
			writer.write("\n" + createHeader(header++) + "<template:ImageType");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_imagetype,"string"));
			writer.write("</template:ImageType>");
			header--;
		}
		if (_BidsMeta_inplanephaseencodingdirectiondicom!=null){
			writer.write("\n" + createHeader(header++) + "<template:InPlanePhaseEncodingDirectionDICOM");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_inplanephaseencodingdirectiondicom,"string"));
			writer.write("</template:InPlanePhaseEncodingDirectionDICOM>");
			header--;
		}
		if (_BidsMeta_modality!=null){
			writer.write("\n" + createHeader(header++) + "<template:Modality");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_modality,"string"));
			writer.write("</template:Modality>");
			header--;
		}
		if (_BidsMeta_imagingfrequency!=null){
			writer.write("\n" + createHeader(header++) + "<template:ImagingFrequency");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_imagingfrequency,"float"));
			writer.write("</template:ImagingFrequency>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:ImagingFrequency");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_inversiontime!=null){
			writer.write("\n" + createHeader(header++) + "<template:InversionTime");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_inversiontime,"float"));
			writer.write("</template:InversionTime>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:InversionTime");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_mracquisitiontype!=null){
			writer.write("\n" + createHeader(header++) + "<template:MRAcquisitionType");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_mracquisitiontype,"float"));
			writer.write("</template:MRAcquisitionType>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:MRAcquisitionType");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_magneticfieldstrength!=null){
			writer.write("\n" + createHeader(header++) + "<template:MagneticFieldStrength");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_magneticfieldstrength,"byte"));
			writer.write("</template:MagneticFieldStrength>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:MagneticFieldStrength");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_percentphasefov!=null){
			writer.write("\n" + createHeader(header++) + "<template:PercentPhaseFOV");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_percentphasefov,"byte"));
			writer.write("</template:PercentPhaseFOV>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:PercentPhaseFOV");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_seriesnumber!=null){
			writer.write("\n" + createHeader(header++) + "<template:SeriesNumber");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_seriesnumber,"byte"));
			writer.write("</template:SeriesNumber>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:SeriesNumber");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_slicethickness!=null){
			writer.write("\n" + createHeader(header++) + "<template:SliceThickness");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_slicethickness,"byte"));
			writer.write("</template:SliceThickness>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:SliceThickness");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_spacingbetweenslices!=null){
			writer.write("\n" + createHeader(header++) + "<template:SpacingBetweenSlices");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_spacingbetweenslices,"byte"));
			writer.write("</template:SpacingBetweenSlices>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:SpacingBetweenSlices");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_partialfourier!=null){
			writer.write("\n" + createHeader(header++) + "<template:PartialFourier");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_partialfourier,"float"));
			writer.write("</template:PartialFourier>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:PartialFourier");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_pixelbandwidth!=null){
			writer.write("\n" + createHeader(header++) + "<template:PixelBandwidth");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_pixelbandwidth,"float"));
			writer.write("</template:PixelBandwidth>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:PixelBandwidth");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_repetitiontime!=null){
			writer.write("\n" + createHeader(header++) + "<template:RepetitionTime");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_repetitiontime,"float"));
			writer.write("</template:RepetitionTime>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:RepetitionTime");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_sar!=null){
			writer.write("\n" + createHeader(header++) + "<template:SAR");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_sar,"float"));
			writer.write("</template:SAR>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:SAR");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_patientposition!=null){
			writer.write("\n" + createHeader(header++) + "<template:PatientPosition");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_patientposition,"string"));
			writer.write("</template:PatientPosition>");
			header--;
		}
		if (_BidsMeta_phaseencodingaxis!=null){
			writer.write("\n" + createHeader(header++) + "<template:PhaseEncodingAxis");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_phaseencodingaxis,"string"));
			writer.write("</template:PhaseEncodingAxis>");
			header--;
		}
		if (_BidsMeta_protocolname!=null){
			writer.write("\n" + createHeader(header++) + "<template:ProtocolName");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_protocolname,"string"));
			writer.write("</template:ProtocolName>");
			header--;
		}
		if (_BidsMeta_scanoptions!=null){
			writer.write("\n" + createHeader(header++) + "<template:ScanOptions");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_scanoptions,"string"));
			writer.write("</template:ScanOptions>");
			header--;
		}
		if (_BidsMeta_scanningsequence!=null){
			writer.write("\n" + createHeader(header++) + "<template:ScanningSequence");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_scanningsequence,"string"));
			writer.write("</template:ScanningSequence>");
			header--;
		}
		if (_BidsMeta_sequencevariant!=null){
			writer.write("\n" + createHeader(header++) + "<template:SequenceVariant");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_sequencevariant,"string"));
			writer.write("</template:SequenceVariant>");
			header--;
		}
		if (_BidsMeta_seriesdescription!=null){
			writer.write("\n" + createHeader(header++) + "<template:SeriesDescription");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_seriesdescription,"string"));
			writer.write("</template:SeriesDescription>");
			header--;
		}
		if (_BidsMeta_softwareversions!=null){
			writer.write("\n" + createHeader(header++) + "<template:SoftwareVersions");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_softwareversions,"string"));
			writer.write("</template:SoftwareVersions>");
			header--;
		}
		if (_BidsMeta_stationsname!=null){
			writer.write("\n" + createHeader(header++) + "<template:StationsName");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_stationsname,"string"));
			writer.write("</template:StationsName>");
			header--;
		}
		if (_BidsMeta_dataset!=null){
			writer.write("\n" + createHeader(header++) + "<template:dataset");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_dataset,"string"));
			writer.write("</template:dataset>");
			header--;
		}
		if (_BidsMeta_modalisty!=null){
			writer.write("\n" + createHeader(header++) + "<template:Modalisty");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_modalisty,"string"));
			writer.write("</template:Modalisty>");
			header--;
		}
		if (_BidsMeta_subjectId!=null){
			writer.write("\n" + createHeader(header++) + "<template:subject_id");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_subjectId,"string"));
			writer.write("</template:subject_id>");
			header--;
		}
		if (_BidsMeta_reconmatrixpe!=null){
			writer.write("\n" + createHeader(header++) + "<template:ReconMatrixPE");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_reconmatrixpe,"short"));
			writer.write("</template:ReconMatrixPE>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:ReconMatrixPE");
			writer.write("/>");
			header--;
		}

		if (_BidsMeta_sessionId!=null){
			writer.write("\n" + createHeader(header++) + "<template:session_id");
			writer.write(">");
			writer.write(ValueParser(_BidsMeta_sessionId,"integer"));
			writer.write("</template:session_id>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:session_id");
			writer.write("/>");
			header--;
		}

				writer.write("\n" + createHeader(--header) + "</template:bids_meta>");
			}
			}

		if (_Cjv!=null){
			writer.write("\n" + createHeader(header++) + "<template:cjv");
			writer.write(">");
			writer.write(ValueParser(_Cjv,"float"));
			writer.write("</template:cjv>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:cjv");
			writer.write("/>");
			header--;
		}

		if (_Cnr!=null){
			writer.write("\n" + createHeader(header++) + "<template:cnr");
			writer.write(">");
			writer.write(ValueParser(_Cnr,"float"));
			writer.write("</template:cnr>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:cnr");
			writer.write("/>");
			header--;
		}

		if (_Efc!=null){
			writer.write("\n" + createHeader(header++) + "<template:efc");
			writer.write(">");
			writer.write(ValueParser(_Efc,"float"));
			writer.write("</template:efc>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:efc");
			writer.write("/>");
			header--;
		}

		if (_Fbef!=null){
			writer.write("\n" + createHeader(header++) + "<template:fbef");
			writer.write(">");
			writer.write(ValueParser(_Fbef,"float"));
			writer.write("</template:fbef>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:fbef");
			writer.write("/>");
			header--;
		}

		if (_FwhmAvg!=null){
			writer.write("\n" + createHeader(header++) + "<template:fwhm_avg");
			writer.write(">");
			writer.write(ValueParser(_FwhmAvg,"float"));
			writer.write("</template:fwhm_avg>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:fwhm_avg");
			writer.write("/>");
			header--;
		}

		if (_FwhmX!=null){
			writer.write("\n" + createHeader(header++) + "<template:fwhm_x");
			writer.write(">");
			writer.write(ValueParser(_FwhmX,"float"));
			writer.write("</template:fwhm_x>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:fwhm_x");
			writer.write("/>");
			header--;
		}

		if (_FwhmY!=null){
			writer.write("\n" + createHeader(header++) + "<template:fwhm_y");
			writer.write(">");
			writer.write(ValueParser(_FwhmY,"float"));
			writer.write("</template:fwhm_y>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:fwhm_y");
			writer.write("/>");
			header--;
		}

		if (_FwhmZ!=null){
			writer.write("\n" + createHeader(header++) + "<template:fwhm_z");
			writer.write(">");
			writer.write(ValueParser(_FwhmZ,"float"));
			writer.write("</template:fwhm_z>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:fwhm_z");
			writer.write("/>");
			header--;
		}

		if (_IcvsCsf!=null){
			writer.write("\n" + createHeader(header++) + "<template:icvs_csf");
			writer.write(">");
			writer.write(ValueParser(_IcvsCsf,"float"));
			writer.write("</template:icvs_csf>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:icvs_csf");
			writer.write("/>");
			header--;
		}

		if (_IcvsGm!=null){
			writer.write("\n" + createHeader(header++) + "<template:icvs_gm");
			writer.write(">");
			writer.write(ValueParser(_IcvsGm,"float"));
			writer.write("</template:icvs_gm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:icvs_gm");
			writer.write("/>");
			header--;
		}

		if (_IcvsWm!=null){
			writer.write("\n" + createHeader(header++) + "<template:icvs_wm");
			writer.write(">");
			writer.write(ValueParser(_IcvsWm,"float"));
			writer.write("</template:icvs_wm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:icvs_wm");
			writer.write("/>");
			header--;
		}

		if (_InuMed!=null){
			writer.write("\n" + createHeader(header++) + "<template:inu_med");
			writer.write(">");
			writer.write(ValueParser(_InuMed,"float"));
			writer.write("</template:inu_med>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:inu_med");
			writer.write("/>");
			header--;
		}

		if (_InuRange!=null){
			writer.write("\n" + createHeader(header++) + "<template:inu_range");
			writer.write(">");
			writer.write(ValueParser(_InuRange,"float"));
			writer.write("</template:inu_range>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:inu_range");
			writer.write("/>");
			header--;
		}

		if (_Qi1!=null){
			writer.write("\n" + createHeader(header++) + "<template:qi_1");
			writer.write(">");
			writer.write(ValueParser(_Qi1,"float"));
			writer.write("</template:qi_1>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:qi_1");
			writer.write("/>");
			header--;
		}

		if (_Qi2!=null){
			writer.write("\n" + createHeader(header++) + "<template:qi_2");
			writer.write(">");
			writer.write(ValueParser(_Qi2,"float"));
			writer.write("</template:qi_2>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:qi_2");
			writer.write("/>");
			header--;
		}

		if (_RpveCsf!=null){
			writer.write("\n" + createHeader(header++) + "<template:rpve_csf");
			writer.write(">");
			writer.write(ValueParser(_RpveCsf,"float"));
			writer.write("</template:rpve_csf>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:rpve_csf");
			writer.write("/>");
			header--;
		}

		if (_RpveGm!=null){
			writer.write("\n" + createHeader(header++) + "<template:rpve_gm");
			writer.write(">");
			writer.write(ValueParser(_RpveGm,"float"));
			writer.write("</template:rpve_gm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:rpve_gm");
			writer.write("/>");
			header--;
		}

		if (_RpveWm!=null){
			writer.write("\n" + createHeader(header++) + "<template:rpve_wm");
			writer.write(">");
			writer.write(ValueParser(_RpveWm,"float"));
			writer.write("</template:rpve_wm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:rpve_wm");
			writer.write("/>");
			header--;
		}

		if (_SizeX!=null){
			writer.write("\n" + createHeader(header++) + "<template:size_x");
			writer.write(">");
			writer.write(ValueParser(_SizeX,"float"));
			writer.write("</template:size_x>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:size_x");
			writer.write("/>");
			header--;
		}

		if (_SizeY!=null){
			writer.write("\n" + createHeader(header++) + "<template:size_y");
			writer.write(">");
			writer.write(ValueParser(_SizeY,"float"));
			writer.write("</template:size_y>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:size_y");
			writer.write("/>");
			header--;
		}

		if (_SizeZ!=null){
			writer.write("\n" + createHeader(header++) + "<template:size_z");
			writer.write(">");
			writer.write(ValueParser(_SizeZ,"float"));
			writer.write("</template:size_z>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:size_z");
			writer.write("/>");
			header--;
		}

		if (_SnrCsf!=null){
			writer.write("\n" + createHeader(header++) + "<template:snr_csf");
			writer.write(">");
			writer.write(ValueParser(_SnrCsf,"float"));
			writer.write("</template:snr_csf>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:snr_csf");
			writer.write("/>");
			header--;
		}

		if (_SnrWm!=null){
			writer.write("\n" + createHeader(header++) + "<template:snr_wm");
			writer.write(">");
			writer.write(ValueParser(_SnrWm,"float"));
			writer.write("</template:snr_wm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:snr_wm");
			writer.write("/>");
			header--;
		}

		if (_SnrGm!=null){
			writer.write("\n" + createHeader(header++) + "<template:snr_gm");
			writer.write(">");
			writer.write(ValueParser(_SnrGm,"float"));
			writer.write("</template:snr_gm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:snr_gm");
			writer.write("/>");
			header--;
		}

		if (_SnrTotal!=null){
			writer.write("\n" + createHeader(header++) + "<template:snr_total");
			writer.write(">");
			writer.write(ValueParser(_SnrTotal,"float"));
			writer.write("</template:snr_total>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:snr_total");
			writer.write("/>");
			header--;
		}

		if (_SnrdCsf!=null){
			writer.write("\n" + createHeader(header++) + "<template:snrd_csf");
			writer.write(">");
			writer.write(ValueParser(_SnrdCsf,"float"));
			writer.write("</template:snrd_csf>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:snrd_csf");
			writer.write("/>");
			header--;
		}

		if (_SnrdWm!=null){
			writer.write("\n" + createHeader(header++) + "<template:snrd_wm");
			writer.write(">");
			writer.write(ValueParser(_SnrdWm,"float"));
			writer.write("</template:snrd_wm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:snrd_wm");
			writer.write("/>");
			header--;
		}

		if (_SnrdGm!=null){
			writer.write("\n" + createHeader(header++) + "<template:snrd_gm");
			writer.write(">");
			writer.write(ValueParser(_SnrdGm,"float"));
			writer.write("</template:snrd_gm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:snrd_gm");
			writer.write("/>");
			header--;
		}

		if (_SnrdTotal!=null){
			writer.write("\n" + createHeader(header++) + "<template:snrd_total");
			writer.write(">");
			writer.write(ValueParser(_SnrdTotal,"float"));
			writer.write("</template:snrd_total>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:snrd_total");
			writer.write("/>");
			header--;
		}

		if (_SpacingX!=null){
			writer.write("\n" + createHeader(header++) + "<template:spacing_x");
			writer.write(">");
			writer.write(ValueParser(_SpacingX,"float"));
			writer.write("</template:spacing_x>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:spacing_x");
			writer.write("/>");
			header--;
		}

		if (_SpacingY!=null){
			writer.write("\n" + createHeader(header++) + "<template:spacing_y");
			writer.write(">");
			writer.write(ValueParser(_SpacingY,"float"));
			writer.write("</template:spacing_y>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:spacing_y");
			writer.write("/>");
			header--;
		}

		if (_SpacingZ!=null){
			writer.write("\n" + createHeader(header++) + "<template:spacing_z");
			writer.write(">");
			writer.write(ValueParser(_SpacingZ,"float"));
			writer.write("</template:spacing_z>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:spacing_z");
			writer.write("/>");
			header--;
		}

		if (_SummaryBgK!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_k");
			writer.write(">");
			writer.write(ValueParser(_SummaryBgK,"float"));
			writer.write("</template:summary_bg_k>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_k");
			writer.write("/>");
			header--;
		}

		if (_SummaryBgMad!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_mad");
			writer.write(">");
			writer.write(ValueParser(_SummaryBgMad,"float"));
			writer.write("</template:summary_bg_mad>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_mad");
			writer.write("/>");
			header--;
		}

		if (_SummaryBgMean!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_mean");
			writer.write(">");
			writer.write(ValueParser(_SummaryBgMean,"float"));
			writer.write("</template:summary_bg_mean>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_mean");
			writer.write("/>");
			header--;
		}

		if (_SummaryBgMedian!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_median");
			writer.write(">");
			writer.write(ValueParser(_SummaryBgMedian,"float"));
			writer.write("</template:summary_bg_median>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_median");
			writer.write("/>");
			header--;
		}

		if (_SummaryBgN!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_n");
			writer.write(">");
			writer.write(ValueParser(_SummaryBgN,"float"));
			writer.write("</template:summary_bg_n>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_n");
			writer.write("/>");
			header--;
		}

		if (_SummaryBgP05!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_p05");
			writer.write(">");
			writer.write(ValueParser(_SummaryBgP05,"float"));
			writer.write("</template:summary_bg_p05>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_p05");
			writer.write("/>");
			header--;
		}

		if (_SummaryBgP95!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_p95");
			writer.write(">");
			writer.write(ValueParser(_SummaryBgP95,"float"));
			writer.write("</template:summary_bg_p95>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_p95");
			writer.write("/>");
			header--;
		}

		if (_SummaryBgStdv!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_stdv");
			writer.write(">");
			writer.write(ValueParser(_SummaryBgStdv,"float"));
			writer.write("</template:summary_bg_stdv>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_bg_stdv");
			writer.write("/>");
			header--;
		}

		if (_SummaryCsfK!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_k");
			writer.write(">");
			writer.write(ValueParser(_SummaryCsfK,"float"));
			writer.write("</template:summary_csf_k>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_k");
			writer.write("/>");
			header--;
		}

		if (_SummaryCsfMad!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_mad");
			writer.write(">");
			writer.write(ValueParser(_SummaryCsfMad,"float"));
			writer.write("</template:summary_csf_mad>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_mad");
			writer.write("/>");
			header--;
		}

		if (_SummaryCsfMean!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_mean");
			writer.write(">");
			writer.write(ValueParser(_SummaryCsfMean,"float"));
			writer.write("</template:summary_csf_mean>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_mean");
			writer.write("/>");
			header--;
		}

		if (_SummaryCsfMedian!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_median");
			writer.write(">");
			writer.write(ValueParser(_SummaryCsfMedian,"float"));
			writer.write("</template:summary_csf_median>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_median");
			writer.write("/>");
			header--;
		}

		if (_SummaryCsfN!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_n");
			writer.write(">");
			writer.write(ValueParser(_SummaryCsfN,"float"));
			writer.write("</template:summary_csf_n>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_n");
			writer.write("/>");
			header--;
		}

		if (_SummaryCsfP05!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_p05");
			writer.write(">");
			writer.write(ValueParser(_SummaryCsfP05,"float"));
			writer.write("</template:summary_csf_p05>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_p05");
			writer.write("/>");
			header--;
		}

		if (_SummaryCsfP95!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_p95");
			writer.write(">");
			writer.write(ValueParser(_SummaryCsfP95,"float"));
			writer.write("</template:summary_csf_p95>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_p95");
			writer.write("/>");
			header--;
		}

		if (_SummaryCsfStdv!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_stdv");
			writer.write(">");
			writer.write(ValueParser(_SummaryCsfStdv,"float"));
			writer.write("</template:summary_csf_stdv>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_csf_stdv");
			writer.write("/>");
			header--;
		}

		if (_SummaryGmK!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_k");
			writer.write(">");
			writer.write(ValueParser(_SummaryGmK,"float"));
			writer.write("</template:summary_gm_k>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_k");
			writer.write("/>");
			header--;
		}

		if (_SummaryGmMad!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_mad");
			writer.write(">");
			writer.write(ValueParser(_SummaryGmMad,"float"));
			writer.write("</template:summary_gm_mad>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_mad");
			writer.write("/>");
			header--;
		}

		if (_SummaryGmMean!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_mean");
			writer.write(">");
			writer.write(ValueParser(_SummaryGmMean,"float"));
			writer.write("</template:summary_gm_mean>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_mean");
			writer.write("/>");
			header--;
		}

		if (_SummaryGmMedian!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_median");
			writer.write(">");
			writer.write(ValueParser(_SummaryGmMedian,"float"));
			writer.write("</template:summary_gm_median>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_median");
			writer.write("/>");
			header--;
		}

		if (_SummaryGmN!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_n");
			writer.write(">");
			writer.write(ValueParser(_SummaryGmN,"float"));
			writer.write("</template:summary_gm_n>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_n");
			writer.write("/>");
			header--;
		}

		if (_SummaryGmP05!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_p05");
			writer.write(">");
			writer.write(ValueParser(_SummaryGmP05,"float"));
			writer.write("</template:summary_gm_p05>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_p05");
			writer.write("/>");
			header--;
		}

		if (_SummaryGmP95!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_p95");
			writer.write(">");
			writer.write(ValueParser(_SummaryGmP95,"float"));
			writer.write("</template:summary_gm_p95>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_p95");
			writer.write("/>");
			header--;
		}

		if (_SummaryGmStdv!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_stdv");
			writer.write(">");
			writer.write(ValueParser(_SummaryGmStdv,"float"));
			writer.write("</template:summary_gm_stdv>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_gm_stdv");
			writer.write("/>");
			header--;
		}

		if (_SummaryWmK!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_k");
			writer.write(">");
			writer.write(ValueParser(_SummaryWmK,"float"));
			writer.write("</template:summary_wm_k>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_k");
			writer.write("/>");
			header--;
		}

		if (_SummaryWmMad!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_mad");
			writer.write(">");
			writer.write(ValueParser(_SummaryWmMad,"float"));
			writer.write("</template:summary_wm_mad>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_mad");
			writer.write("/>");
			header--;
		}

		if (_SummaryWmMean!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_mean");
			writer.write(">");
			writer.write(ValueParser(_SummaryWmMean,"float"));
			writer.write("</template:summary_wm_mean>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_mean");
			writer.write("/>");
			header--;
		}

		if (_SummaryWmMedian!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_median");
			writer.write(">");
			writer.write(ValueParser(_SummaryWmMedian,"float"));
			writer.write("</template:summary_wm_median>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_median");
			writer.write("/>");
			header--;
		}

		if (_SummaryWmN!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_n");
			writer.write(">");
			writer.write(ValueParser(_SummaryWmN,"float"));
			writer.write("</template:summary_wm_n>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_n");
			writer.write("/>");
			header--;
		}

		if (_SummaryWmP05!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_p05");
			writer.write(">");
			writer.write(ValueParser(_SummaryWmP05,"float"));
			writer.write("</template:summary_wm_p05>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_p05");
			writer.write("/>");
			header--;
		}

		if (_SummaryWmP95!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_p95");
			writer.write(">");
			writer.write(ValueParser(_SummaryWmP95,"float"));
			writer.write("</template:summary_wm_p95>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_p95");
			writer.write("/>");
			header--;
		}

		if (_SummaryWmStdv!=null){
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_stdv");
			writer.write(">");
			writer.write(ValueParser(_SummaryWmStdv,"float"));
			writer.write("</template:summary_wm_stdv>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:summary_wm_stdv");
			writer.write("/>");
			header--;
		}

		if (_TpmOverlapCsf!=null){
			writer.write("\n" + createHeader(header++) + "<template:tpm_overlap_csf");
			writer.write(">");
			writer.write(ValueParser(_TpmOverlapCsf,"float"));
			writer.write("</template:tpm_overlap_csf>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:tpm_overlap_csf");
			writer.write("/>");
			header--;
		}

		if (_TpmOverlapGm!=null){
			writer.write("\n" + createHeader(header++) + "<template:tpm_overlap_gm");
			writer.write(">");
			writer.write(ValueParser(_TpmOverlapGm,"float"));
			writer.write("</template:tpm_overlap_gm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:tpm_overlap_gm");
			writer.write("/>");
			header--;
		}

		if (_TpmOverlapWm!=null){
			writer.write("\n" + createHeader(header++) + "<template:tpm_overlap_wm");
			writer.write(">");
			writer.write(ValueParser(_TpmOverlapWm,"float"));
			writer.write("</template:tpm_overlap_wm>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:tpm_overlap_wm");
			writer.write("/>");
			header--;
		}

		if (_Wm2max!=null){
			writer.write("\n" + createHeader(header++) + "<template:wm2max");
			writer.write(">");
			writer.write(ValueParser(_Wm2max,"float"));
			writer.write("</template:wm2max>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<template:wm2max");
			writer.write("/>");
			header--;
		}

			int child1=0;
			int att1=0;
			if(_Provenance_md5sum!=null)
			child1++;
			if(_Provenance_software!=null)
			child1++;
			if(_Provenance_settings!=null)
			child1++;
			if(_Provenance_version!=null)
			child1++;
			if(_Provenance_webapiPort!=null)
			child1++;
			if(_Provenance_webapiUrl!=null)
			child1++;
			if(_Provenance_warnings!=null)
			child1++;
			if(child1>0 || att1>0){
				writer.write("\n" + createHeader(header++) + "<template:provenance");
			if(child1==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Provenance_md5sum!=null){
			writer.write("\n" + createHeader(header++) + "<template:md5sum");
			writer.write(">");
			writer.write(ValueParser(_Provenance_md5sum,"string"));
			writer.write("</template:md5sum>");
			header--;
		}
		if (_Provenance_settings!=null){
			writer.write("\n" + createHeader(header++) + "<template:settings");
			writer.write(">");
			writer.write(ValueParser(_Provenance_settings,"string"));
			writer.write("</template:settings>");
			header--;
		}
		if (_Provenance_software!=null){
			writer.write("\n" + createHeader(header++) + "<template:software");
			writer.write(">");
			writer.write(ValueParser(_Provenance_software,"string"));
			writer.write("</template:software>");
			header--;
		}
		if (_Provenance_version!=null){
			writer.write("\n" + createHeader(header++) + "<template:version");
			writer.write(">");
			writer.write(ValueParser(_Provenance_version,"string"));
			writer.write("</template:version>");
			header--;
		}
		if (_Provenance_warnings!=null){
			writer.write("\n" + createHeader(header++) + "<template:warnings");
			writer.write(">");
			writer.write(ValueParser(_Provenance_warnings,"string"));
			writer.write("</template:warnings>");
			header--;
		}
		if (_Provenance_webapiPort!=null){
			writer.write("\n" + createHeader(header++) + "<template:webapi_port");
			writer.write(">");
			writer.write(ValueParser(_Provenance_webapiPort,"string"));
			writer.write("</template:webapi_port>");
			header--;
		}
		if (_Provenance_webapiUrl!=null){
			writer.write("\n" + createHeader(header++) + "<template:webapi_url");
			writer.write(">");
			writer.write(ValueParser(_Provenance_webapiUrl,"string"));
			writer.write("</template:webapi_url>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</template:provenance>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_BidsMeta_modalisty!=null) return true;
			if(_BidsMeta_scanningsequence!=null) return true;
			if(_BidsMeta_sequencevariant!=null) return true;
			if(_BidsMeta_echotrainlength!=null) return true;
			if(_BidsMeta_conversionsoftware!=null) return true;
			if(_BidsMeta_patientposition!=null) return true;
			if(_BidsMeta_stationsname!=null) return true;
			if(_BidsMeta_modality!=null) return true;
			if(_BidsMeta_acquisitionstime!=null) return true;
			if(_BidsMeta_sar!=null) return true;
			if(_BidsMeta_sessionId!=null) return true;
			if(_BidsMeta_partialfourier!=null) return true;
			if(_BidsMeta_coilstring!=null) return true;
			if(_BidsMeta_subjectId!=null) return true;
			if(_BidsMeta_conversionsoftwareversion!=null) return true;
			if(_BidsMeta_phaseencodingaxis!=null) return true;
			if(_BidsMeta_dataset!=null) return true;
			if(_BidsMeta_acquisitionsmatrixpe!=null) return true;
			if(_BidsMeta_percentphasefov!=null) return true;
			if(_BidsMeta_repetitiontime!=null) return true;
			if(_BidsMeta_protocolname!=null) return true;
			if(_BidsMeta_imagetype!=null) return true;
			if(_BidsMeta_echotime!=null) return true;
			if(_BidsMeta_inplanephaseencodingdirectiondicom!=null) return true;
			if(_BidsMeta_seriesnumber!=null) return true;
			if(_BidsMeta_acquisitionsnumber!=null) return true;
			if(_BidsMeta_pixelbandwidth!=null) return true;
			if(_BidsMeta_slicethickness!=null) return true;
			if(_BidsMeta_softwareversions!=null) return true;
			if(_BidsMeta_deviceserioalnumber!=null) return true;
			if(_BidsMeta_inversiontime!=null) return true;
			if(_BidsMeta_imageorientationpatientdicom!=null) return true;
			if(_BidsMeta_scanoptions!=null) return true;
			if(_BidsMeta_bodypartexamined!=null) return true;
			if(_BidsMeta_magneticfieldstrength!=null) return true;
			if(_BidsMeta_seriesdescription!=null) return true;
			if(_BidsMeta_flipangle!=null) return true;
			if(_BidsMeta_spacingbetweenslices!=null) return true;
			if(_BidsMeta_mracquisitiontype!=null) return true;
			if(_BidsMeta_imagingfrequency!=null) return true;
			if(_BidsMeta_reconmatrixpe!=null) return true;
		if (_Cjv!=null) return true;
		return true;//REQUIRED cjv
	}
}
