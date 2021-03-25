/*
 * GENERATED FILE
 * Created on Thu Mar 25 10:21:19 EDT 2021
 *
 */
package org.nrg.xdat.om.base.auto;
import org.apache.log4j.Logger;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

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
public abstract class AutoTemplateMriqccollection extends XnatImageassessordata implements org.nrg.xdat.model.TemplateMriqccollectionI {
	public static final Logger logger = Logger.getLogger(AutoTemplateMriqccollection.class);
	public static final String SCHEMA_ELEMENT_NAME="template:mriqcCollection";

	public AutoTemplateMriqccollection(ItemI item)
	{
		super(item);
	}

	public AutoTemplateMriqccollection(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoTemplateMriqccollection(UserI user)
	 **/
	public AutoTemplateMriqccollection(){}

	public AutoTemplateMriqccollection(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "template:mriqcCollection";
	}
	 private org.nrg.xdat.om.XnatImageassessordata _Imageassessordata =null;

	/**
	 * imageAssessorData
	 * @return org.nrg.xdat.om.XnatImageassessordata
	 */
	public org.nrg.xdat.om.XnatImageassessordata getImageassessordata() {
		try{
			if (_Imageassessordata==null){
				_Imageassessordata=((XnatImageassessordata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("imageAssessorData")));
				return _Imageassessordata;
			}else {
				return _Imageassessordata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for imageAssessorData.
	 * @param v Value to Set.
	 */
	public void setImageassessordata(ItemI v) throws Exception{
		_Imageassessordata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/imageAssessorData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/imageAssessorData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * imageAssessorData
	 * set org.nrg.xdat.model.XnatImageassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatImageassessordataI> void setImageassessordata(A item) throws Exception{
	setImageassessordata((ItemI)item);
	}

	/**
	 * Removes the imageAssessorData.
	 * */
	public void removeImageassessordata() {
		_Imageassessordata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/imageAssessorData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_acquisitionsmatrixpe=null;

	/**
	 * @return Returns the bids_meta/AcquisitionsMatrixPE.
	 */
	public Object getBidsMeta_acquisitionsmatrixpe(){
		try{
			if (_BidsMeta_acquisitionsmatrixpe==null){
				_BidsMeta_acquisitionsmatrixpe=getProperty("bids_meta/AcquisitionsMatrixPE");
				return _BidsMeta_acquisitionsmatrixpe;
			}else {
				return _BidsMeta_acquisitionsmatrixpe;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/AcquisitionsMatrixPE.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionsmatrixpe(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/AcquisitionsMatrixPE",v);
		_BidsMeta_acquisitionsmatrixpe=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_acquisitionsnumber=null;

	/**
	 * @return Returns the bids_meta/AcquisitionsNumber.
	 */
	public Object getBidsMeta_acquisitionsnumber(){
		try{
			if (_BidsMeta_acquisitionsnumber==null){
				_BidsMeta_acquisitionsnumber=getProperty("bids_meta/AcquisitionsNumber");
				return _BidsMeta_acquisitionsnumber;
			}else {
				return _BidsMeta_acquisitionsnumber;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/AcquisitionsNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionsnumber(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/AcquisitionsNumber",v);
		_BidsMeta_acquisitionsnumber=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_acquisitionstime=null;

	/**
	 * @return Returns the bids_meta/AcquisitionsTime.
	 */
	public Object getBidsMeta_acquisitionstime(){
		try{
			if (_BidsMeta_acquisitionstime==null){
				_BidsMeta_acquisitionstime=getProperty("bids_meta/AcquisitionsTime");
				return _BidsMeta_acquisitionstime;
			}else {
				return _BidsMeta_acquisitionstime;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/AcquisitionsTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionstime(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/AcquisitionsTime",v);
		_BidsMeta_acquisitionstime=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_bodypartexamined=null;

	/**
	 * @return Returns the bids_meta/BodyPartExamined.
	 */
	public String getBidsMeta_bodypartexamined(){
		try{
			if (_BidsMeta_bodypartexamined==null){
				_BidsMeta_bodypartexamined=getStringProperty("bids_meta/BodyPartExamined");
				return _BidsMeta_bodypartexamined;
			}else {
				return _BidsMeta_bodypartexamined;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/BodyPartExamined.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_bodypartexamined(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/BodyPartExamined",v);
		_BidsMeta_bodypartexamined=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_coilstring=null;

	/**
	 * @return Returns the bids_meta/CoilString.
	 */
	public String getBidsMeta_coilstring(){
		try{
			if (_BidsMeta_coilstring==null){
				_BidsMeta_coilstring=getStringProperty("bids_meta/CoilString");
				return _BidsMeta_coilstring;
			}else {
				return _BidsMeta_coilstring;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/CoilString.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_coilstring(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/CoilString",v);
		_BidsMeta_coilstring=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_conversionsoftware=null;

	/**
	 * @return Returns the bids_meta/ConversionSoftware.
	 */
	public String getBidsMeta_conversionsoftware(){
		try{
			if (_BidsMeta_conversionsoftware==null){
				_BidsMeta_conversionsoftware=getStringProperty("bids_meta/ConversionSoftware");
				return _BidsMeta_conversionsoftware;
			}else {
				return _BidsMeta_conversionsoftware;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ConversionSoftware.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_conversionsoftware(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ConversionSoftware",v);
		_BidsMeta_conversionsoftware=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_conversionsoftwareversion=null;

	/**
	 * @return Returns the bids_meta/ConversionSoftwareVersion.
	 */
	public String getBidsMeta_conversionsoftwareversion(){
		try{
			if (_BidsMeta_conversionsoftwareversion==null){
				_BidsMeta_conversionsoftwareversion=getStringProperty("bids_meta/ConversionSoftwareVersion");
				return _BidsMeta_conversionsoftwareversion;
			}else {
				return _BidsMeta_conversionsoftwareversion;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ConversionSoftwareVersion.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_conversionsoftwareversion(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ConversionSoftwareVersion",v);
		_BidsMeta_conversionsoftwareversion=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_deviceserioalnumber=null;

	/**
	 * @return Returns the bids_meta/DeviceSerioalNumber.
	 */
	public String getBidsMeta_deviceserioalnumber(){
		try{
			if (_BidsMeta_deviceserioalnumber==null){
				_BidsMeta_deviceserioalnumber=getStringProperty("bids_meta/DeviceSerioalNumber");
				return _BidsMeta_deviceserioalnumber;
			}else {
				return _BidsMeta_deviceserioalnumber;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/DeviceSerioalNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_deviceserioalnumber(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/DeviceSerioalNumber",v);
		_BidsMeta_deviceserioalnumber=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _BidsMeta_echotime=null;

	/**
	 * @return Returns the bids_meta/EchoTime.
	 */
	public Double getBidsMeta_echotime() {
		try{
			if (_BidsMeta_echotime==null){
				_BidsMeta_echotime=getDoubleProperty("bids_meta/EchoTime");
				return _BidsMeta_echotime;
			}else {
				return _BidsMeta_echotime;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/EchoTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_echotime(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/EchoTime",v);
		_BidsMeta_echotime=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_echotrainlength=null;

	/**
	 * @return Returns the bids_meta/EchoTrainLength.
	 */
	public Object getBidsMeta_echotrainlength(){
		try{
			if (_BidsMeta_echotrainlength==null){
				_BidsMeta_echotrainlength=getProperty("bids_meta/EchoTrainLength");
				return _BidsMeta_echotrainlength;
			}else {
				return _BidsMeta_echotrainlength;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/EchoTrainLength.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_echotrainlength(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/EchoTrainLength",v);
		_BidsMeta_echotrainlength=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_flipangle=null;

	/**
	 * @return Returns the bids_meta/FlipAngle.
	 */
	public Object getBidsMeta_flipangle(){
		try{
			if (_BidsMeta_flipangle==null){
				_BidsMeta_flipangle=getProperty("bids_meta/FlipAngle");
				return _BidsMeta_flipangle;
			}else {
				return _BidsMeta_flipangle;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/FlipAngle.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_flipangle(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/FlipAngle",v);
		_BidsMeta_flipangle=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_imageorientationpatientdicom=null;

	/**
	 * @return Returns the bids_meta/ImageOrientationPatientDICOM.
	 */
	public String getBidsMeta_imageorientationpatientdicom(){
		try{
			if (_BidsMeta_imageorientationpatientdicom==null){
				_BidsMeta_imageorientationpatientdicom=getStringProperty("bids_meta/ImageOrientationPatientDICOM");
				return _BidsMeta_imageorientationpatientdicom;
			}else {
				return _BidsMeta_imageorientationpatientdicom;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ImageOrientationPatientDICOM.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imageorientationpatientdicom(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ImageOrientationPatientDICOM",v);
		_BidsMeta_imageorientationpatientdicom=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_imagetype=null;

	/**
	 * @return Returns the bids_meta/ImageType.
	 */
	public String getBidsMeta_imagetype(){
		try{
			if (_BidsMeta_imagetype==null){
				_BidsMeta_imagetype=getStringProperty("bids_meta/ImageType");
				return _BidsMeta_imagetype;
			}else {
				return _BidsMeta_imagetype;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ImageType.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imagetype(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ImageType",v);
		_BidsMeta_imagetype=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_inplanephaseencodingdirectiondicom=null;

	/**
	 * @return Returns the bids_meta/InPlanePhaseEncodingDirectionDICOM.
	 */
	public String getBidsMeta_inplanephaseencodingdirectiondicom(){
		try{
			if (_BidsMeta_inplanephaseencodingdirectiondicom==null){
				_BidsMeta_inplanephaseencodingdirectiondicom=getStringProperty("bids_meta/InPlanePhaseEncodingDirectionDICOM");
				return _BidsMeta_inplanephaseencodingdirectiondicom;
			}else {
				return _BidsMeta_inplanephaseencodingdirectiondicom;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/InPlanePhaseEncodingDirectionDICOM.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_inplanephaseencodingdirectiondicom(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/InPlanePhaseEncodingDirectionDICOM",v);
		_BidsMeta_inplanephaseencodingdirectiondicom=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_modality=null;

	/**
	 * @return Returns the bids_meta/Modality.
	 */
	public String getBidsMeta_modality(){
		try{
			if (_BidsMeta_modality==null){
				_BidsMeta_modality=getStringProperty("bids_meta/Modality");
				return _BidsMeta_modality;
			}else {
				return _BidsMeta_modality;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/Modality.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_modality(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/Modality",v);
		_BidsMeta_modality=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _BidsMeta_imagingfrequency=null;

	/**
	 * @return Returns the bids_meta/ImagingFrequency.
	 */
	public Double getBidsMeta_imagingfrequency() {
		try{
			if (_BidsMeta_imagingfrequency==null){
				_BidsMeta_imagingfrequency=getDoubleProperty("bids_meta/ImagingFrequency");
				return _BidsMeta_imagingfrequency;
			}else {
				return _BidsMeta_imagingfrequency;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ImagingFrequency.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imagingfrequency(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ImagingFrequency",v);
		_BidsMeta_imagingfrequency=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _BidsMeta_inversiontime=null;

	/**
	 * @return Returns the bids_meta/InversionTime.
	 */
	public Double getBidsMeta_inversiontime() {
		try{
			if (_BidsMeta_inversiontime==null){
				_BidsMeta_inversiontime=getDoubleProperty("bids_meta/InversionTime");
				return _BidsMeta_inversiontime;
			}else {
				return _BidsMeta_inversiontime;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/InversionTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_inversiontime(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/InversionTime",v);
		_BidsMeta_inversiontime=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _BidsMeta_mracquisitiontype=null;

	/**
	 * @return Returns the bids_meta/MRAcquisitionType.
	 */
	public Double getBidsMeta_mracquisitiontype() {
		try{
			if (_BidsMeta_mracquisitiontype==null){
				_BidsMeta_mracquisitiontype=getDoubleProperty("bids_meta/MRAcquisitionType");
				return _BidsMeta_mracquisitiontype;
			}else {
				return _BidsMeta_mracquisitiontype;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/MRAcquisitionType.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_mracquisitiontype(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/MRAcquisitionType",v);
		_BidsMeta_mracquisitiontype=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_magneticfieldstrength=null;

	/**
	 * @return Returns the bids_meta/MagneticFieldStrength.
	 */
	public Object getBidsMeta_magneticfieldstrength(){
		try{
			if (_BidsMeta_magneticfieldstrength==null){
				_BidsMeta_magneticfieldstrength=getProperty("bids_meta/MagneticFieldStrength");
				return _BidsMeta_magneticfieldstrength;
			}else {
				return _BidsMeta_magneticfieldstrength;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/MagneticFieldStrength.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_magneticfieldstrength(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/MagneticFieldStrength",v);
		_BidsMeta_magneticfieldstrength=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_percentphasefov=null;

	/**
	 * @return Returns the bids_meta/PercentPhaseFOV.
	 */
	public Object getBidsMeta_percentphasefov(){
		try{
			if (_BidsMeta_percentphasefov==null){
				_BidsMeta_percentphasefov=getProperty("bids_meta/PercentPhaseFOV");
				return _BidsMeta_percentphasefov;
			}else {
				return _BidsMeta_percentphasefov;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/PercentPhaseFOV.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_percentphasefov(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/PercentPhaseFOV",v);
		_BidsMeta_percentphasefov=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_seriesnumber=null;

	/**
	 * @return Returns the bids_meta/SeriesNumber.
	 */
	public Object getBidsMeta_seriesnumber(){
		try{
			if (_BidsMeta_seriesnumber==null){
				_BidsMeta_seriesnumber=getProperty("bids_meta/SeriesNumber");
				return _BidsMeta_seriesnumber;
			}else {
				return _BidsMeta_seriesnumber;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/SeriesNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_seriesnumber(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/SeriesNumber",v);
		_BidsMeta_seriesnumber=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_slicethickness=null;

	/**
	 * @return Returns the bids_meta/SliceThickness.
	 */
	public Object getBidsMeta_slicethickness(){
		try{
			if (_BidsMeta_slicethickness==null){
				_BidsMeta_slicethickness=getProperty("bids_meta/SliceThickness");
				return _BidsMeta_slicethickness;
			}else {
				return _BidsMeta_slicethickness;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/SliceThickness.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_slicethickness(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/SliceThickness",v);
		_BidsMeta_slicethickness=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_spacingbetweenslices=null;

	/**
	 * @return Returns the bids_meta/SpacingBetweenSlices.
	 */
	public Object getBidsMeta_spacingbetweenslices(){
		try{
			if (_BidsMeta_spacingbetweenslices==null){
				_BidsMeta_spacingbetweenslices=getProperty("bids_meta/SpacingBetweenSlices");
				return _BidsMeta_spacingbetweenslices;
			}else {
				return _BidsMeta_spacingbetweenslices;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/SpacingBetweenSlices.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_spacingbetweenslices(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/SpacingBetweenSlices",v);
		_BidsMeta_spacingbetweenslices=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _BidsMeta_partialfourier=null;

	/**
	 * @return Returns the bids_meta/PartialFourier.
	 */
	public Double getBidsMeta_partialfourier() {
		try{
			if (_BidsMeta_partialfourier==null){
				_BidsMeta_partialfourier=getDoubleProperty("bids_meta/PartialFourier");
				return _BidsMeta_partialfourier;
			}else {
				return _BidsMeta_partialfourier;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/PartialFourier.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_partialfourier(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/PartialFourier",v);
		_BidsMeta_partialfourier=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _BidsMeta_pixelbandwidth=null;

	/**
	 * @return Returns the bids_meta/PixelBandwidth.
	 */
	public Double getBidsMeta_pixelbandwidth() {
		try{
			if (_BidsMeta_pixelbandwidth==null){
				_BidsMeta_pixelbandwidth=getDoubleProperty("bids_meta/PixelBandwidth");
				return _BidsMeta_pixelbandwidth;
			}else {
				return _BidsMeta_pixelbandwidth;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/PixelBandwidth.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_pixelbandwidth(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/PixelBandwidth",v);
		_BidsMeta_pixelbandwidth=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _BidsMeta_repetitiontime=null;

	/**
	 * @return Returns the bids_meta/RepetitionTime.
	 */
	public Double getBidsMeta_repetitiontime() {
		try{
			if (_BidsMeta_repetitiontime==null){
				_BidsMeta_repetitiontime=getDoubleProperty("bids_meta/RepetitionTime");
				return _BidsMeta_repetitiontime;
			}else {
				return _BidsMeta_repetitiontime;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/RepetitionTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_repetitiontime(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/RepetitionTime",v);
		_BidsMeta_repetitiontime=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _BidsMeta_sar=null;

	/**
	 * @return Returns the bids_meta/SAR.
	 */
	public Double getBidsMeta_sar() {
		try{
			if (_BidsMeta_sar==null){
				_BidsMeta_sar=getDoubleProperty("bids_meta/SAR");
				return _BidsMeta_sar;
			}else {
				return _BidsMeta_sar;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/SAR.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sar(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/SAR",v);
		_BidsMeta_sar=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_patientposition=null;

	/**
	 * @return Returns the bids_meta/PatientPosition.
	 */
	public String getBidsMeta_patientposition(){
		try{
			if (_BidsMeta_patientposition==null){
				_BidsMeta_patientposition=getStringProperty("bids_meta/PatientPosition");
				return _BidsMeta_patientposition;
			}else {
				return _BidsMeta_patientposition;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/PatientPosition.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_patientposition(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/PatientPosition",v);
		_BidsMeta_patientposition=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_phaseencodingaxis=null;

	/**
	 * @return Returns the bids_meta/PhaseEncodingAxis.
	 */
	public String getBidsMeta_phaseencodingaxis(){
		try{
			if (_BidsMeta_phaseencodingaxis==null){
				_BidsMeta_phaseencodingaxis=getStringProperty("bids_meta/PhaseEncodingAxis");
				return _BidsMeta_phaseencodingaxis;
			}else {
				return _BidsMeta_phaseencodingaxis;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/PhaseEncodingAxis.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_phaseencodingaxis(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/PhaseEncodingAxis",v);
		_BidsMeta_phaseencodingaxis=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_protocolname=null;

	/**
	 * @return Returns the bids_meta/ProtocolName.
	 */
	public String getBidsMeta_protocolname(){
		try{
			if (_BidsMeta_protocolname==null){
				_BidsMeta_protocolname=getStringProperty("bids_meta/ProtocolName");
				return _BidsMeta_protocolname;
			}else {
				return _BidsMeta_protocolname;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ProtocolName.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_protocolname(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ProtocolName",v);
		_BidsMeta_protocolname=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_scanoptions=null;

	/**
	 * @return Returns the bids_meta/ScanOptions.
	 */
	public String getBidsMeta_scanoptions(){
		try{
			if (_BidsMeta_scanoptions==null){
				_BidsMeta_scanoptions=getStringProperty("bids_meta/ScanOptions");
				return _BidsMeta_scanoptions;
			}else {
				return _BidsMeta_scanoptions;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ScanOptions.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_scanoptions(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ScanOptions",v);
		_BidsMeta_scanoptions=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_scanningsequence=null;

	/**
	 * @return Returns the bids_meta/ScanningSequence.
	 */
	public String getBidsMeta_scanningsequence(){
		try{
			if (_BidsMeta_scanningsequence==null){
				_BidsMeta_scanningsequence=getStringProperty("bids_meta/ScanningSequence");
				return _BidsMeta_scanningsequence;
			}else {
				return _BidsMeta_scanningsequence;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ScanningSequence.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_scanningsequence(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ScanningSequence",v);
		_BidsMeta_scanningsequence=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_sequencevariant=null;

	/**
	 * @return Returns the bids_meta/SequenceVariant.
	 */
	public String getBidsMeta_sequencevariant(){
		try{
			if (_BidsMeta_sequencevariant==null){
				_BidsMeta_sequencevariant=getStringProperty("bids_meta/SequenceVariant");
				return _BidsMeta_sequencevariant;
			}else {
				return _BidsMeta_sequencevariant;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/SequenceVariant.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sequencevariant(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/SequenceVariant",v);
		_BidsMeta_sequencevariant=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_seriesdescription=null;

	/**
	 * @return Returns the bids_meta/SeriesDescription.
	 */
	public String getBidsMeta_seriesdescription(){
		try{
			if (_BidsMeta_seriesdescription==null){
				_BidsMeta_seriesdescription=getStringProperty("bids_meta/SeriesDescription");
				return _BidsMeta_seriesdescription;
			}else {
				return _BidsMeta_seriesdescription;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/SeriesDescription.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_seriesdescription(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/SeriesDescription",v);
		_BidsMeta_seriesdescription=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_softwareversions=null;

	/**
	 * @return Returns the bids_meta/SoftwareVersions.
	 */
	public String getBidsMeta_softwareversions(){
		try{
			if (_BidsMeta_softwareversions==null){
				_BidsMeta_softwareversions=getStringProperty("bids_meta/SoftwareVersions");
				return _BidsMeta_softwareversions;
			}else {
				return _BidsMeta_softwareversions;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/SoftwareVersions.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_softwareversions(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/SoftwareVersions",v);
		_BidsMeta_softwareversions=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_stationsname=null;

	/**
	 * @return Returns the bids_meta/StationsName.
	 */
	public String getBidsMeta_stationsname(){
		try{
			if (_BidsMeta_stationsname==null){
				_BidsMeta_stationsname=getStringProperty("bids_meta/StationsName");
				return _BidsMeta_stationsname;
			}else {
				return _BidsMeta_stationsname;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/StationsName.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_stationsname(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/StationsName",v);
		_BidsMeta_stationsname=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_dataset=null;

	/**
	 * @return Returns the bids_meta/dataset.
	 */
	public String getBidsMeta_dataset(){
		try{
			if (_BidsMeta_dataset==null){
				_BidsMeta_dataset=getStringProperty("bids_meta/dataset");
				return _BidsMeta_dataset;
			}else {
				return _BidsMeta_dataset;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/dataset.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_dataset(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/dataset",v);
		_BidsMeta_dataset=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_modalisty=null;

	/**
	 * @return Returns the bids_meta/Modalisty.
	 */
	public String getBidsMeta_modalisty(){
		try{
			if (_BidsMeta_modalisty==null){
				_BidsMeta_modalisty=getStringProperty("bids_meta/Modalisty");
				return _BidsMeta_modalisty;
			}else {
				return _BidsMeta_modalisty;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/Modalisty.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_modalisty(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/Modalisty",v);
		_BidsMeta_modalisty=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _BidsMeta_subjectId=null;

	/**
	 * @return Returns the bids_meta/subject_id.
	 */
	public String getBidsMeta_subjectId(){
		try{
			if (_BidsMeta_subjectId==null){
				_BidsMeta_subjectId=getStringProperty("bids_meta/subject_id");
				return _BidsMeta_subjectId;
			}else {
				return _BidsMeta_subjectId;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/subject_id.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_subjectId(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/subject_id",v);
		_BidsMeta_subjectId=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _BidsMeta_reconmatrixpe=null;

	/**
	 * @return Returns the bids_meta/ReconMatrixPE.
	 */
	public Object getBidsMeta_reconmatrixpe(){
		try{
			if (_BidsMeta_reconmatrixpe==null){
				_BidsMeta_reconmatrixpe=getProperty("bids_meta/ReconMatrixPE");
				return _BidsMeta_reconmatrixpe;
			}else {
				return _BidsMeta_reconmatrixpe;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/ReconMatrixPE.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_reconmatrixpe(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/ReconMatrixPE",v);
		_BidsMeta_reconmatrixpe=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _BidsMeta_sessionId=null;

	/**
	 * @return Returns the bids_meta/session_id.
	 */
	public Integer getBidsMeta_sessionId() {
		try{
			if (_BidsMeta_sessionId==null){
				_BidsMeta_sessionId=getIntegerProperty("bids_meta/session_id");
				return _BidsMeta_sessionId;
			}else {
				return _BidsMeta_sessionId;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for bids_meta/session_id.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sessionId(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/bids_meta/session_id",v);
		_BidsMeta_sessionId=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Cjv=null;

	/**
	 * @return Returns the cjv.
	 */
	public Double getCjv() {
		try{
			if (_Cjv==null){
				_Cjv=getDoubleProperty("cjv");
				return _Cjv;
			}else {
				return _Cjv;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for cjv.
	 * @param v Value to Set.
	 */
	public void setCjv(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/cjv",v);
		_Cjv=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Cnr=null;

	/**
	 * @return Returns the cnr.
	 */
	public Double getCnr() {
		try{
			if (_Cnr==null){
				_Cnr=getDoubleProperty("cnr");
				return _Cnr;
			}else {
				return _Cnr;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for cnr.
	 * @param v Value to Set.
	 */
	public void setCnr(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/cnr",v);
		_Cnr=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Efc=null;

	/**
	 * @return Returns the efc.
	 */
	public Double getEfc() {
		try{
			if (_Efc==null){
				_Efc=getDoubleProperty("efc");
				return _Efc;
			}else {
				return _Efc;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for efc.
	 * @param v Value to Set.
	 */
	public void setEfc(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/efc",v);
		_Efc=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Fbef=null;

	/**
	 * @return Returns the fbef.
	 */
	public Double getFbef() {
		try{
			if (_Fbef==null){
				_Fbef=getDoubleProperty("fbef");
				return _Fbef;
			}else {
				return _Fbef;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for fbef.
	 * @param v Value to Set.
	 */
	public void setFbef(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/fbef",v);
		_Fbef=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _FwhmAvg=null;

	/**
	 * @return Returns the fwhm_avg.
	 */
	public Double getFwhmAvg() {
		try{
			if (_FwhmAvg==null){
				_FwhmAvg=getDoubleProperty("fwhm_avg");
				return _FwhmAvg;
			}else {
				return _FwhmAvg;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for fwhm_avg.
	 * @param v Value to Set.
	 */
	public void setFwhmAvg(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/fwhm_avg",v);
		_FwhmAvg=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _FwhmX=null;

	/**
	 * @return Returns the fwhm_x.
	 */
	public Double getFwhmX() {
		try{
			if (_FwhmX==null){
				_FwhmX=getDoubleProperty("fwhm_x");
				return _FwhmX;
			}else {
				return _FwhmX;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for fwhm_x.
	 * @param v Value to Set.
	 */
	public void setFwhmX(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/fwhm_x",v);
		_FwhmX=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _FwhmY=null;

	/**
	 * @return Returns the fwhm_y.
	 */
	public Double getFwhmY() {
		try{
			if (_FwhmY==null){
				_FwhmY=getDoubleProperty("fwhm_y");
				return _FwhmY;
			}else {
				return _FwhmY;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for fwhm_y.
	 * @param v Value to Set.
	 */
	public void setFwhmY(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/fwhm_y",v);
		_FwhmY=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _FwhmZ=null;

	/**
	 * @return Returns the fwhm_z.
	 */
	public Double getFwhmZ() {
		try{
			if (_FwhmZ==null){
				_FwhmZ=getDoubleProperty("fwhm_z");
				return _FwhmZ;
			}else {
				return _FwhmZ;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for fwhm_z.
	 * @param v Value to Set.
	 */
	public void setFwhmZ(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/fwhm_z",v);
		_FwhmZ=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _IcvsCsf=null;

	/**
	 * @return Returns the icvs_csf.
	 */
	public Double getIcvsCsf() {
		try{
			if (_IcvsCsf==null){
				_IcvsCsf=getDoubleProperty("icvs_csf");
				return _IcvsCsf;
			}else {
				return _IcvsCsf;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for icvs_csf.
	 * @param v Value to Set.
	 */
	public void setIcvsCsf(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/icvs_csf",v);
		_IcvsCsf=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _IcvsGm=null;

	/**
	 * @return Returns the icvs_gm.
	 */
	public Double getIcvsGm() {
		try{
			if (_IcvsGm==null){
				_IcvsGm=getDoubleProperty("icvs_gm");
				return _IcvsGm;
			}else {
				return _IcvsGm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for icvs_gm.
	 * @param v Value to Set.
	 */
	public void setIcvsGm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/icvs_gm",v);
		_IcvsGm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _IcvsWm=null;

	/**
	 * @return Returns the icvs_wm.
	 */
	public Double getIcvsWm() {
		try{
			if (_IcvsWm==null){
				_IcvsWm=getDoubleProperty("icvs_wm");
				return _IcvsWm;
			}else {
				return _IcvsWm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for icvs_wm.
	 * @param v Value to Set.
	 */
	public void setIcvsWm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/icvs_wm",v);
		_IcvsWm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _InuMed=null;

	/**
	 * @return Returns the inu_med.
	 */
	public Double getInuMed() {
		try{
			if (_InuMed==null){
				_InuMed=getDoubleProperty("inu_med");
				return _InuMed;
			}else {
				return _InuMed;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for inu_med.
	 * @param v Value to Set.
	 */
	public void setInuMed(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/inu_med",v);
		_InuMed=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _InuRange=null;

	/**
	 * @return Returns the inu_range.
	 */
	public Double getInuRange() {
		try{
			if (_InuRange==null){
				_InuRange=getDoubleProperty("inu_range");
				return _InuRange;
			}else {
				return _InuRange;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for inu_range.
	 * @param v Value to Set.
	 */
	public void setInuRange(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/inu_range",v);
		_InuRange=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Qi1=null;

	/**
	 * @return Returns the qi_1.
	 */
	public Double getQi1() {
		try{
			if (_Qi1==null){
				_Qi1=getDoubleProperty("qi_1");
				return _Qi1;
			}else {
				return _Qi1;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for qi_1.
	 * @param v Value to Set.
	 */
	public void setQi1(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/qi_1",v);
		_Qi1=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Qi2=null;

	/**
	 * @return Returns the qi_2.
	 */
	public Double getQi2() {
		try{
			if (_Qi2==null){
				_Qi2=getDoubleProperty("qi_2");
				return _Qi2;
			}else {
				return _Qi2;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for qi_2.
	 * @param v Value to Set.
	 */
	public void setQi2(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/qi_2",v);
		_Qi2=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _RpveCsf=null;

	/**
	 * @return Returns the rpve_csf.
	 */
	public Double getRpveCsf() {
		try{
			if (_RpveCsf==null){
				_RpveCsf=getDoubleProperty("rpve_csf");
				return _RpveCsf;
			}else {
				return _RpveCsf;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for rpve_csf.
	 * @param v Value to Set.
	 */
	public void setRpveCsf(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/rpve_csf",v);
		_RpveCsf=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _RpveGm=null;

	/**
	 * @return Returns the rpve_gm.
	 */
	public Double getRpveGm() {
		try{
			if (_RpveGm==null){
				_RpveGm=getDoubleProperty("rpve_gm");
				return _RpveGm;
			}else {
				return _RpveGm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for rpve_gm.
	 * @param v Value to Set.
	 */
	public void setRpveGm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/rpve_gm",v);
		_RpveGm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _RpveWm=null;

	/**
	 * @return Returns the rpve_wm.
	 */
	public Double getRpveWm() {
		try{
			if (_RpveWm==null){
				_RpveWm=getDoubleProperty("rpve_wm");
				return _RpveWm;
			}else {
				return _RpveWm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for rpve_wm.
	 * @param v Value to Set.
	 */
	public void setRpveWm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/rpve_wm",v);
		_RpveWm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SizeX=null;

	/**
	 * @return Returns the size_x.
	 */
	public Double getSizeX() {
		try{
			if (_SizeX==null){
				_SizeX=getDoubleProperty("size_x");
				return _SizeX;
			}else {
				return _SizeX;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for size_x.
	 * @param v Value to Set.
	 */
	public void setSizeX(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/size_x",v);
		_SizeX=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SizeY=null;

	/**
	 * @return Returns the size_y.
	 */
	public Double getSizeY() {
		try{
			if (_SizeY==null){
				_SizeY=getDoubleProperty("size_y");
				return _SizeY;
			}else {
				return _SizeY;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for size_y.
	 * @param v Value to Set.
	 */
	public void setSizeY(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/size_y",v);
		_SizeY=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SizeZ=null;

	/**
	 * @return Returns the size_z.
	 */
	public Double getSizeZ() {
		try{
			if (_SizeZ==null){
				_SizeZ=getDoubleProperty("size_z");
				return _SizeZ;
			}else {
				return _SizeZ;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for size_z.
	 * @param v Value to Set.
	 */
	public void setSizeZ(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/size_z",v);
		_SizeZ=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SnrCsf=null;

	/**
	 * @return Returns the snr_csf.
	 */
	public Double getSnrCsf() {
		try{
			if (_SnrCsf==null){
				_SnrCsf=getDoubleProperty("snr_csf");
				return _SnrCsf;
			}else {
				return _SnrCsf;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for snr_csf.
	 * @param v Value to Set.
	 */
	public void setSnrCsf(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/snr_csf",v);
		_SnrCsf=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SnrWm=null;

	/**
	 * @return Returns the snr_wm.
	 */
	public Double getSnrWm() {
		try{
			if (_SnrWm==null){
				_SnrWm=getDoubleProperty("snr_wm");
				return _SnrWm;
			}else {
				return _SnrWm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for snr_wm.
	 * @param v Value to Set.
	 */
	public void setSnrWm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/snr_wm",v);
		_SnrWm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SnrGm=null;

	/**
	 * @return Returns the snr_gm.
	 */
	public Double getSnrGm() {
		try{
			if (_SnrGm==null){
				_SnrGm=getDoubleProperty("snr_gm");
				return _SnrGm;
			}else {
				return _SnrGm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for snr_gm.
	 * @param v Value to Set.
	 */
	public void setSnrGm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/snr_gm",v);
		_SnrGm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SnrTotal=null;

	/**
	 * @return Returns the snr_total.
	 */
	public Double getSnrTotal() {
		try{
			if (_SnrTotal==null){
				_SnrTotal=getDoubleProperty("snr_total");
				return _SnrTotal;
			}else {
				return _SnrTotal;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for snr_total.
	 * @param v Value to Set.
	 */
	public void setSnrTotal(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/snr_total",v);
		_SnrTotal=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SnrdCsf=null;

	/**
	 * @return Returns the snrd_csf.
	 */
	public Double getSnrdCsf() {
		try{
			if (_SnrdCsf==null){
				_SnrdCsf=getDoubleProperty("snrd_csf");
				return _SnrdCsf;
			}else {
				return _SnrdCsf;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for snrd_csf.
	 * @param v Value to Set.
	 */
	public void setSnrdCsf(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/snrd_csf",v);
		_SnrdCsf=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SnrdWm=null;

	/**
	 * @return Returns the snrd_wm.
	 */
	public Double getSnrdWm() {
		try{
			if (_SnrdWm==null){
				_SnrdWm=getDoubleProperty("snrd_wm");
				return _SnrdWm;
			}else {
				return _SnrdWm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for snrd_wm.
	 * @param v Value to Set.
	 */
	public void setSnrdWm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/snrd_wm",v);
		_SnrdWm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SnrdGm=null;

	/**
	 * @return Returns the snrd_gm.
	 */
	public Double getSnrdGm() {
		try{
			if (_SnrdGm==null){
				_SnrdGm=getDoubleProperty("snrd_gm");
				return _SnrdGm;
			}else {
				return _SnrdGm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for snrd_gm.
	 * @param v Value to Set.
	 */
	public void setSnrdGm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/snrd_gm",v);
		_SnrdGm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SnrdTotal=null;

	/**
	 * @return Returns the snrd_total.
	 */
	public Double getSnrdTotal() {
		try{
			if (_SnrdTotal==null){
				_SnrdTotal=getDoubleProperty("snrd_total");
				return _SnrdTotal;
			}else {
				return _SnrdTotal;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for snrd_total.
	 * @param v Value to Set.
	 */
	public void setSnrdTotal(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/snrd_total",v);
		_SnrdTotal=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SpacingX=null;

	/**
	 * @return Returns the spacing_x.
	 */
	public Double getSpacingX() {
		try{
			if (_SpacingX==null){
				_SpacingX=getDoubleProperty("spacing_x");
				return _SpacingX;
			}else {
				return _SpacingX;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for spacing_x.
	 * @param v Value to Set.
	 */
	public void setSpacingX(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/spacing_x",v);
		_SpacingX=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SpacingY=null;

	/**
	 * @return Returns the spacing_y.
	 */
	public Double getSpacingY() {
		try{
			if (_SpacingY==null){
				_SpacingY=getDoubleProperty("spacing_y");
				return _SpacingY;
			}else {
				return _SpacingY;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for spacing_y.
	 * @param v Value to Set.
	 */
	public void setSpacingY(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/spacing_y",v);
		_SpacingY=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SpacingZ=null;

	/**
	 * @return Returns the spacing_z.
	 */
	public Double getSpacingZ() {
		try{
			if (_SpacingZ==null){
				_SpacingZ=getDoubleProperty("spacing_z");
				return _SpacingZ;
			}else {
				return _SpacingZ;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for spacing_z.
	 * @param v Value to Set.
	 */
	public void setSpacingZ(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/spacing_z",v);
		_SpacingZ=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryBgK=null;

	/**
	 * @return Returns the summary_bg_k.
	 */
	public Double getSummaryBgK() {
		try{
			if (_SummaryBgK==null){
				_SummaryBgK=getDoubleProperty("summary_bg_k");
				return _SummaryBgK;
			}else {
				return _SummaryBgK;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_bg_k.
	 * @param v Value to Set.
	 */
	public void setSummaryBgK(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_bg_k",v);
		_SummaryBgK=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryBgMad=null;

	/**
	 * @return Returns the summary_bg_mad.
	 */
	public Double getSummaryBgMad() {
		try{
			if (_SummaryBgMad==null){
				_SummaryBgMad=getDoubleProperty("summary_bg_mad");
				return _SummaryBgMad;
			}else {
				return _SummaryBgMad;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_bg_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMad(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_bg_mad",v);
		_SummaryBgMad=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryBgMean=null;

	/**
	 * @return Returns the summary_bg_mean.
	 */
	public Double getSummaryBgMean() {
		try{
			if (_SummaryBgMean==null){
				_SummaryBgMean=getDoubleProperty("summary_bg_mean");
				return _SummaryBgMean;
			}else {
				return _SummaryBgMean;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_bg_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMean(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_bg_mean",v);
		_SummaryBgMean=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryBgMedian=null;

	/**
	 * @return Returns the summary_bg_median.
	 */
	public Double getSummaryBgMedian() {
		try{
			if (_SummaryBgMedian==null){
				_SummaryBgMedian=getDoubleProperty("summary_bg_median");
				return _SummaryBgMedian;
			}else {
				return _SummaryBgMedian;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_bg_median.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMedian(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_bg_median",v);
		_SummaryBgMedian=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryBgN=null;

	/**
	 * @return Returns the summary_bg_n.
	 */
	public Double getSummaryBgN() {
		try{
			if (_SummaryBgN==null){
				_SummaryBgN=getDoubleProperty("summary_bg_n");
				return _SummaryBgN;
			}else {
				return _SummaryBgN;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_bg_n.
	 * @param v Value to Set.
	 */
	public void setSummaryBgN(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_bg_n",v);
		_SummaryBgN=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryBgP05=null;

	/**
	 * @return Returns the summary_bg_p05.
	 */
	public Double getSummaryBgP05() {
		try{
			if (_SummaryBgP05==null){
				_SummaryBgP05=getDoubleProperty("summary_bg_p05");
				return _SummaryBgP05;
			}else {
				return _SummaryBgP05;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_bg_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryBgP05(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_bg_p05",v);
		_SummaryBgP05=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryBgP95=null;

	/**
	 * @return Returns the summary_bg_p95.
	 */
	public Double getSummaryBgP95() {
		try{
			if (_SummaryBgP95==null){
				_SummaryBgP95=getDoubleProperty("summary_bg_p95");
				return _SummaryBgP95;
			}else {
				return _SummaryBgP95;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_bg_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryBgP95(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_bg_p95",v);
		_SummaryBgP95=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryBgStdv=null;

	/**
	 * @return Returns the summary_bg_stdv.
	 */
	public Double getSummaryBgStdv() {
		try{
			if (_SummaryBgStdv==null){
				_SummaryBgStdv=getDoubleProperty("summary_bg_stdv");
				return _SummaryBgStdv;
			}else {
				return _SummaryBgStdv;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_bg_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryBgStdv(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_bg_stdv",v);
		_SummaryBgStdv=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryCsfK=null;

	/**
	 * @return Returns the summary_csf_k.
	 */
	public Double getSummaryCsfK() {
		try{
			if (_SummaryCsfK==null){
				_SummaryCsfK=getDoubleProperty("summary_csf_k");
				return _SummaryCsfK;
			}else {
				return _SummaryCsfK;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_csf_k.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfK(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_csf_k",v);
		_SummaryCsfK=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryCsfMad=null;

	/**
	 * @return Returns the summary_csf_mad.
	 */
	public Double getSummaryCsfMad() {
		try{
			if (_SummaryCsfMad==null){
				_SummaryCsfMad=getDoubleProperty("summary_csf_mad");
				return _SummaryCsfMad;
			}else {
				return _SummaryCsfMad;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_csf_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMad(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_csf_mad",v);
		_SummaryCsfMad=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryCsfMean=null;

	/**
	 * @return Returns the summary_csf_mean.
	 */
	public Double getSummaryCsfMean() {
		try{
			if (_SummaryCsfMean==null){
				_SummaryCsfMean=getDoubleProperty("summary_csf_mean");
				return _SummaryCsfMean;
			}else {
				return _SummaryCsfMean;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_csf_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMean(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_csf_mean",v);
		_SummaryCsfMean=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryCsfMedian=null;

	/**
	 * @return Returns the summary_csf_median.
	 */
	public Double getSummaryCsfMedian() {
		try{
			if (_SummaryCsfMedian==null){
				_SummaryCsfMedian=getDoubleProperty("summary_csf_median");
				return _SummaryCsfMedian;
			}else {
				return _SummaryCsfMedian;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_csf_median.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMedian(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_csf_median",v);
		_SummaryCsfMedian=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryCsfN=null;

	/**
	 * @return Returns the summary_csf_n.
	 */
	public Double getSummaryCsfN() {
		try{
			if (_SummaryCsfN==null){
				_SummaryCsfN=getDoubleProperty("summary_csf_n");
				return _SummaryCsfN;
			}else {
				return _SummaryCsfN;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_csf_n.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfN(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_csf_n",v);
		_SummaryCsfN=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryCsfP05=null;

	/**
	 * @return Returns the summary_csf_p05.
	 */
	public Double getSummaryCsfP05() {
		try{
			if (_SummaryCsfP05==null){
				_SummaryCsfP05=getDoubleProperty("summary_csf_p05");
				return _SummaryCsfP05;
			}else {
				return _SummaryCsfP05;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_csf_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfP05(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_csf_p05",v);
		_SummaryCsfP05=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryCsfP95=null;

	/**
	 * @return Returns the summary_csf_p95.
	 */
	public Double getSummaryCsfP95() {
		try{
			if (_SummaryCsfP95==null){
				_SummaryCsfP95=getDoubleProperty("summary_csf_p95");
				return _SummaryCsfP95;
			}else {
				return _SummaryCsfP95;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_csf_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfP95(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_csf_p95",v);
		_SummaryCsfP95=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryCsfStdv=null;

	/**
	 * @return Returns the summary_csf_stdv.
	 */
	public Double getSummaryCsfStdv() {
		try{
			if (_SummaryCsfStdv==null){
				_SummaryCsfStdv=getDoubleProperty("summary_csf_stdv");
				return _SummaryCsfStdv;
			}else {
				return _SummaryCsfStdv;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_csf_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfStdv(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_csf_stdv",v);
		_SummaryCsfStdv=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryGmK=null;

	/**
	 * @return Returns the summary_gm_k.
	 */
	public Double getSummaryGmK() {
		try{
			if (_SummaryGmK==null){
				_SummaryGmK=getDoubleProperty("summary_gm_k");
				return _SummaryGmK;
			}else {
				return _SummaryGmK;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_gm_k.
	 * @param v Value to Set.
	 */
	public void setSummaryGmK(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_gm_k",v);
		_SummaryGmK=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryGmMad=null;

	/**
	 * @return Returns the summary_gm_mad.
	 */
	public Double getSummaryGmMad() {
		try{
			if (_SummaryGmMad==null){
				_SummaryGmMad=getDoubleProperty("summary_gm_mad");
				return _SummaryGmMad;
			}else {
				return _SummaryGmMad;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_gm_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMad(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_gm_mad",v);
		_SummaryGmMad=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryGmMean=null;

	/**
	 * @return Returns the summary_gm_mean.
	 */
	public Double getSummaryGmMean() {
		try{
			if (_SummaryGmMean==null){
				_SummaryGmMean=getDoubleProperty("summary_gm_mean");
				return _SummaryGmMean;
			}else {
				return _SummaryGmMean;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_gm_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMean(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_gm_mean",v);
		_SummaryGmMean=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryGmMedian=null;

	/**
	 * @return Returns the summary_gm_median.
	 */
	public Double getSummaryGmMedian() {
		try{
			if (_SummaryGmMedian==null){
				_SummaryGmMedian=getDoubleProperty("summary_gm_median");
				return _SummaryGmMedian;
			}else {
				return _SummaryGmMedian;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_gm_median.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMedian(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_gm_median",v);
		_SummaryGmMedian=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryGmN=null;

	/**
	 * @return Returns the summary_gm_n.
	 */
	public Double getSummaryGmN() {
		try{
			if (_SummaryGmN==null){
				_SummaryGmN=getDoubleProperty("summary_gm_n");
				return _SummaryGmN;
			}else {
				return _SummaryGmN;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_gm_n.
	 * @param v Value to Set.
	 */
	public void setSummaryGmN(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_gm_n",v);
		_SummaryGmN=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryGmP05=null;

	/**
	 * @return Returns the summary_gm_p05.
	 */
	public Double getSummaryGmP05() {
		try{
			if (_SummaryGmP05==null){
				_SummaryGmP05=getDoubleProperty("summary_gm_p05");
				return _SummaryGmP05;
			}else {
				return _SummaryGmP05;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_gm_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryGmP05(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_gm_p05",v);
		_SummaryGmP05=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryGmP95=null;

	/**
	 * @return Returns the summary_gm_p95.
	 */
	public Double getSummaryGmP95() {
		try{
			if (_SummaryGmP95==null){
				_SummaryGmP95=getDoubleProperty("summary_gm_p95");
				return _SummaryGmP95;
			}else {
				return _SummaryGmP95;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_gm_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryGmP95(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_gm_p95",v);
		_SummaryGmP95=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryGmStdv=null;

	/**
	 * @return Returns the summary_gm_stdv.
	 */
	public Double getSummaryGmStdv() {
		try{
			if (_SummaryGmStdv==null){
				_SummaryGmStdv=getDoubleProperty("summary_gm_stdv");
				return _SummaryGmStdv;
			}else {
				return _SummaryGmStdv;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_gm_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryGmStdv(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_gm_stdv",v);
		_SummaryGmStdv=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryWmK=null;

	/**
	 * @return Returns the summary_wm_k.
	 */
	public Double getSummaryWmK() {
		try{
			if (_SummaryWmK==null){
				_SummaryWmK=getDoubleProperty("summary_wm_k");
				return _SummaryWmK;
			}else {
				return _SummaryWmK;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_wm_k.
	 * @param v Value to Set.
	 */
	public void setSummaryWmK(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_wm_k",v);
		_SummaryWmK=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryWmMad=null;

	/**
	 * @return Returns the summary_wm_mad.
	 */
	public Double getSummaryWmMad() {
		try{
			if (_SummaryWmMad==null){
				_SummaryWmMad=getDoubleProperty("summary_wm_mad");
				return _SummaryWmMad;
			}else {
				return _SummaryWmMad;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_wm_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMad(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_wm_mad",v);
		_SummaryWmMad=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryWmMean=null;

	/**
	 * @return Returns the summary_wm_mean.
	 */
	public Double getSummaryWmMean() {
		try{
			if (_SummaryWmMean==null){
				_SummaryWmMean=getDoubleProperty("summary_wm_mean");
				return _SummaryWmMean;
			}else {
				return _SummaryWmMean;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_wm_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMean(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_wm_mean",v);
		_SummaryWmMean=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryWmMedian=null;

	/**
	 * @return Returns the summary_wm_median.
	 */
	public Double getSummaryWmMedian() {
		try{
			if (_SummaryWmMedian==null){
				_SummaryWmMedian=getDoubleProperty("summary_wm_median");
				return _SummaryWmMedian;
			}else {
				return _SummaryWmMedian;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_wm_median.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMedian(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_wm_median",v);
		_SummaryWmMedian=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryWmN=null;

	/**
	 * @return Returns the summary_wm_n.
	 */
	public Double getSummaryWmN() {
		try{
			if (_SummaryWmN==null){
				_SummaryWmN=getDoubleProperty("summary_wm_n");
				return _SummaryWmN;
			}else {
				return _SummaryWmN;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_wm_n.
	 * @param v Value to Set.
	 */
	public void setSummaryWmN(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_wm_n",v);
		_SummaryWmN=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryWmP05=null;

	/**
	 * @return Returns the summary_wm_p05.
	 */
	public Double getSummaryWmP05() {
		try{
			if (_SummaryWmP05==null){
				_SummaryWmP05=getDoubleProperty("summary_wm_p05");
				return _SummaryWmP05;
			}else {
				return _SummaryWmP05;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_wm_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryWmP05(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_wm_p05",v);
		_SummaryWmP05=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryWmP95=null;

	/**
	 * @return Returns the summary_wm_p95.
	 */
	public Double getSummaryWmP95() {
		try{
			if (_SummaryWmP95==null){
				_SummaryWmP95=getDoubleProperty("summary_wm_p95");
				return _SummaryWmP95;
			}else {
				return _SummaryWmP95;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_wm_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryWmP95(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_wm_p95",v);
		_SummaryWmP95=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _SummaryWmStdv=null;

	/**
	 * @return Returns the summary_wm_stdv.
	 */
	public Double getSummaryWmStdv() {
		try{
			if (_SummaryWmStdv==null){
				_SummaryWmStdv=getDoubleProperty("summary_wm_stdv");
				return _SummaryWmStdv;
			}else {
				return _SummaryWmStdv;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary_wm_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryWmStdv(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary_wm_stdv",v);
		_SummaryWmStdv=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _TpmOverlapCsf=null;

	/**
	 * @return Returns the tpm_overlap_csf.
	 */
	public Double getTpmOverlapCsf() {
		try{
			if (_TpmOverlapCsf==null){
				_TpmOverlapCsf=getDoubleProperty("tpm_overlap_csf");
				return _TpmOverlapCsf;
			}else {
				return _TpmOverlapCsf;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for tpm_overlap_csf.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapCsf(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/tpm_overlap_csf",v);
		_TpmOverlapCsf=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _TpmOverlapGm=null;

	/**
	 * @return Returns the tpm_overlap_gm.
	 */
	public Double getTpmOverlapGm() {
		try{
			if (_TpmOverlapGm==null){
				_TpmOverlapGm=getDoubleProperty("tpm_overlap_gm");
				return _TpmOverlapGm;
			}else {
				return _TpmOverlapGm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for tpm_overlap_gm.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapGm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/tpm_overlap_gm",v);
		_TpmOverlapGm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _TpmOverlapWm=null;

	/**
	 * @return Returns the tpm_overlap_wm.
	 */
	public Double getTpmOverlapWm() {
		try{
			if (_TpmOverlapWm==null){
				_TpmOverlapWm=getDoubleProperty("tpm_overlap_wm");
				return _TpmOverlapWm;
			}else {
				return _TpmOverlapWm;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for tpm_overlap_wm.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapWm(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/tpm_overlap_wm",v);
		_TpmOverlapWm=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Wm2max=null;

	/**
	 * @return Returns the wm2max.
	 */
	public Double getWm2max() {
		try{
			if (_Wm2max==null){
				_Wm2max=getDoubleProperty("wm2max");
				return _Wm2max;
			}else {
				return _Wm2max;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for wm2max.
	 * @param v Value to Set.
	 */
	public void setWm2max(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/wm2max",v);
		_Wm2max=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Provenance_md5sum=null;

	/**
	 * @return Returns the provenance/md5sum.
	 */
	public String getProvenance_md5sum(){
		try{
			if (_Provenance_md5sum==null){
				_Provenance_md5sum=getStringProperty("provenance/md5sum");
				return _Provenance_md5sum;
			}else {
				return _Provenance_md5sum;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for provenance/md5sum.
	 * @param v Value to Set.
	 */
	public void setProvenance_md5sum(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/provenance/md5sum",v);
		_Provenance_md5sum=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Provenance_settings=null;

	/**
	 * @return Returns the provenance/settings.
	 */
	public String getProvenance_settings(){
		try{
			if (_Provenance_settings==null){
				_Provenance_settings=getStringProperty("provenance/settings");
				return _Provenance_settings;
			}else {
				return _Provenance_settings;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for provenance/settings.
	 * @param v Value to Set.
	 */
	public void setProvenance_settings(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/provenance/settings",v);
		_Provenance_settings=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Provenance_software=null;

	/**
	 * @return Returns the provenance/software.
	 */
	public String getProvenance_software(){
		try{
			if (_Provenance_software==null){
				_Provenance_software=getStringProperty("provenance/software");
				return _Provenance_software;
			}else {
				return _Provenance_software;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for provenance/software.
	 * @param v Value to Set.
	 */
	public void setProvenance_software(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/provenance/software",v);
		_Provenance_software=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Provenance_version=null;

	/**
	 * @return Returns the provenance/version.
	 */
	public String getProvenance_version(){
		try{
			if (_Provenance_version==null){
				_Provenance_version=getStringProperty("provenance/version");
				return _Provenance_version;
			}else {
				return _Provenance_version;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for provenance/version.
	 * @param v Value to Set.
	 */
	public void setProvenance_version(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/provenance/version",v);
		_Provenance_version=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Provenance_warnings=null;

	/**
	 * @return Returns the provenance/warnings.
	 */
	public String getProvenance_warnings(){
		try{
			if (_Provenance_warnings==null){
				_Provenance_warnings=getStringProperty("provenance/warnings");
				return _Provenance_warnings;
			}else {
				return _Provenance_warnings;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for provenance/warnings.
	 * @param v Value to Set.
	 */
	public void setProvenance_warnings(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/provenance/warnings",v);
		_Provenance_warnings=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Provenance_webapiPort=null;

	/**
	 * @return Returns the provenance/webapi_port.
	 */
	public String getProvenance_webapiPort(){
		try{
			if (_Provenance_webapiPort==null){
				_Provenance_webapiPort=getStringProperty("provenance/webapi_port");
				return _Provenance_webapiPort;
			}else {
				return _Provenance_webapiPort;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for provenance/webapi_port.
	 * @param v Value to Set.
	 */
	public void setProvenance_webapiPort(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/provenance/webapi_port",v);
		_Provenance_webapiPort=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Provenance_webapiUrl=null;

	/**
	 * @return Returns the provenance/webapi_url.
	 */
	public String getProvenance_webapiUrl(){
		try{
			if (_Provenance_webapiUrl==null){
				_Provenance_webapiUrl=getStringProperty("provenance/webapi_url");
				return _Provenance_webapiUrl;
			}else {
				return _Provenance_webapiUrl;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for provenance/webapi_url.
	 * @param v Value to Set.
	 */
	public void setProvenance_webapiUrl(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/provenance/webapi_url",v);
		_Provenance_webapiUrl=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.TemplateMriqccollection> getAllTemplateMriqccollections(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.TemplateMriqccollection> al = new ArrayList<org.nrg.xdat.om.TemplateMriqccollection>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.TemplateMriqccollection> getTemplateMriqccollectionsByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.TemplateMriqccollection> al = new ArrayList<org.nrg.xdat.om.TemplateMriqccollection>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.TemplateMriqccollection> getTemplateMriqccollectionsByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.TemplateMriqccollection> al = new ArrayList<org.nrg.xdat.om.TemplateMriqccollection>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static TemplateMriqccollection getTemplateMriqccollectionsById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("template:mriqcCollection/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (TemplateMriqccollection) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (IllegalAccessException e) {
			final StackTraceElement[] stacktrace = e.getStackTrace();
			final String location = stacktrace == null || stacktrace.length == 0 ? "Unknown (no stack trace)" : stacktrace[0].toString();
			logger.error("The user " + user.getUsername() + " was denied access to the template:mriqcCollection/id instance with ID " + value + ". Occurred at: " + location + "\n" + e.getMessage());
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //imageAssessorData
	        XnatImageassessordata childImageassessordata = (XnatImageassessordata)this.getImageassessordata();
	            if (childImageassessordata!=null){
	              for(ResourceFile rf: ((XnatImageassessordata)childImageassessordata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("imageAssessorData[" + ((XnatImageassessordata)childImageassessordata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("imageAssessorData/" + ((XnatImageassessordata)childImageassessordata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}
