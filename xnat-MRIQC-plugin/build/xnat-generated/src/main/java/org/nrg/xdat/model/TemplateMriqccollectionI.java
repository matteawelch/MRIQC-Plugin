/*
 * GENERATED FILE
 * Created on Thu Mar 25 10:21:19 EDT 2021
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface TemplateMriqccollectionI extends XnatImageassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the bids_meta/AcquisitionsMatrixPE.
	 */
	public Object getBidsMeta_acquisitionsmatrixpe();

	/**
	 * Sets the value for bids_meta/AcquisitionsMatrixPE.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionsmatrixpe(Object v);

	/**
	 * @return Returns the bids_meta/AcquisitionsNumber.
	 */
	public Object getBidsMeta_acquisitionsnumber();

	/**
	 * Sets the value for bids_meta/AcquisitionsNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionsnumber(Object v);

	/**
	 * @return Returns the bids_meta/AcquisitionsTime.
	 */
	public Object getBidsMeta_acquisitionstime();

	/**
	 * Sets the value for bids_meta/AcquisitionsTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_acquisitionstime(Object v);

	/**
	 * @return Returns the bids_meta/BodyPartExamined.
	 */
	public String getBidsMeta_bodypartexamined();

	/**
	 * Sets the value for bids_meta/BodyPartExamined.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_bodypartexamined(String v);

	/**
	 * @return Returns the bids_meta/CoilString.
	 */
	public String getBidsMeta_coilstring();

	/**
	 * Sets the value for bids_meta/CoilString.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_coilstring(String v);

	/**
	 * @return Returns the bids_meta/ConversionSoftware.
	 */
	public String getBidsMeta_conversionsoftware();

	/**
	 * Sets the value for bids_meta/ConversionSoftware.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_conversionsoftware(String v);

	/**
	 * @return Returns the bids_meta/ConversionSoftwareVersion.
	 */
	public String getBidsMeta_conversionsoftwareversion();

	/**
	 * Sets the value for bids_meta/ConversionSoftwareVersion.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_conversionsoftwareversion(String v);

	/**
	 * @return Returns the bids_meta/DeviceSerioalNumber.
	 */
	public String getBidsMeta_deviceserioalnumber();

	/**
	 * Sets the value for bids_meta/DeviceSerioalNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_deviceserioalnumber(String v);

	/**
	 * @return Returns the bids_meta/EchoTime.
	 */
	public Double getBidsMeta_echotime();

	/**
	 * Sets the value for bids_meta/EchoTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_echotime(Double v);

	/**
	 * @return Returns the bids_meta/EchoTrainLength.
	 */
	public Object getBidsMeta_echotrainlength();

	/**
	 * Sets the value for bids_meta/EchoTrainLength.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_echotrainlength(Object v);

	/**
	 * @return Returns the bids_meta/FlipAngle.
	 */
	public Object getBidsMeta_flipangle();

	/**
	 * Sets the value for bids_meta/FlipAngle.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_flipangle(Object v);

	/**
	 * @return Returns the bids_meta/ImageOrientationPatientDICOM.
	 */
	public String getBidsMeta_imageorientationpatientdicom();

	/**
	 * Sets the value for bids_meta/ImageOrientationPatientDICOM.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imageorientationpatientdicom(String v);

	/**
	 * @return Returns the bids_meta/ImageType.
	 */
	public String getBidsMeta_imagetype();

	/**
	 * Sets the value for bids_meta/ImageType.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imagetype(String v);

	/**
	 * @return Returns the bids_meta/InPlanePhaseEncodingDirectionDICOM.
	 */
	public String getBidsMeta_inplanephaseencodingdirectiondicom();

	/**
	 * Sets the value for bids_meta/InPlanePhaseEncodingDirectionDICOM.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_inplanephaseencodingdirectiondicom(String v);

	/**
	 * @return Returns the bids_meta/Modality.
	 */
	public String getBidsMeta_modality();

	/**
	 * Sets the value for bids_meta/Modality.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_modality(String v);

	/**
	 * @return Returns the bids_meta/ImagingFrequency.
	 */
	public Double getBidsMeta_imagingfrequency();

	/**
	 * Sets the value for bids_meta/ImagingFrequency.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_imagingfrequency(Double v);

	/**
	 * @return Returns the bids_meta/InversionTime.
	 */
	public Double getBidsMeta_inversiontime();

	/**
	 * Sets the value for bids_meta/InversionTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_inversiontime(Double v);

	/**
	 * @return Returns the bids_meta/MRAcquisitionType.
	 */
	public Double getBidsMeta_mracquisitiontype();

	/**
	 * Sets the value for bids_meta/MRAcquisitionType.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_mracquisitiontype(Double v);

	/**
	 * @return Returns the bids_meta/MagneticFieldStrength.
	 */
	public Object getBidsMeta_magneticfieldstrength();

	/**
	 * Sets the value for bids_meta/MagneticFieldStrength.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_magneticfieldstrength(Object v);

	/**
	 * @return Returns the bids_meta/PercentPhaseFOV.
	 */
	public Object getBidsMeta_percentphasefov();

	/**
	 * Sets the value for bids_meta/PercentPhaseFOV.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_percentphasefov(Object v);

	/**
	 * @return Returns the bids_meta/SeriesNumber.
	 */
	public Object getBidsMeta_seriesnumber();

	/**
	 * Sets the value for bids_meta/SeriesNumber.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_seriesnumber(Object v);

	/**
	 * @return Returns the bids_meta/SliceThickness.
	 */
	public Object getBidsMeta_slicethickness();

	/**
	 * Sets the value for bids_meta/SliceThickness.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_slicethickness(Object v);

	/**
	 * @return Returns the bids_meta/SpacingBetweenSlices.
	 */
	public Object getBidsMeta_spacingbetweenslices();

	/**
	 * Sets the value for bids_meta/SpacingBetweenSlices.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_spacingbetweenslices(Object v);

	/**
	 * @return Returns the bids_meta/PartialFourier.
	 */
	public Double getBidsMeta_partialfourier();

	/**
	 * Sets the value for bids_meta/PartialFourier.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_partialfourier(Double v);

	/**
	 * @return Returns the bids_meta/PixelBandwidth.
	 */
	public Double getBidsMeta_pixelbandwidth();

	/**
	 * Sets the value for bids_meta/PixelBandwidth.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_pixelbandwidth(Double v);

	/**
	 * @return Returns the bids_meta/RepetitionTime.
	 */
	public Double getBidsMeta_repetitiontime();

	/**
	 * Sets the value for bids_meta/RepetitionTime.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_repetitiontime(Double v);

	/**
	 * @return Returns the bids_meta/SAR.
	 */
	public Double getBidsMeta_sar();

	/**
	 * Sets the value for bids_meta/SAR.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sar(Double v);

	/**
	 * @return Returns the bids_meta/PatientPosition.
	 */
	public String getBidsMeta_patientposition();

	/**
	 * Sets the value for bids_meta/PatientPosition.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_patientposition(String v);

	/**
	 * @return Returns the bids_meta/PhaseEncodingAxis.
	 */
	public String getBidsMeta_phaseencodingaxis();

	/**
	 * Sets the value for bids_meta/PhaseEncodingAxis.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_phaseencodingaxis(String v);

	/**
	 * @return Returns the bids_meta/ProtocolName.
	 */
	public String getBidsMeta_protocolname();

	/**
	 * Sets the value for bids_meta/ProtocolName.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_protocolname(String v);

	/**
	 * @return Returns the bids_meta/ScanOptions.
	 */
	public String getBidsMeta_scanoptions();

	/**
	 * Sets the value for bids_meta/ScanOptions.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_scanoptions(String v);

	/**
	 * @return Returns the bids_meta/ScanningSequence.
	 */
	public String getBidsMeta_scanningsequence();

	/**
	 * Sets the value for bids_meta/ScanningSequence.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_scanningsequence(String v);

	/**
	 * @return Returns the bids_meta/SequenceVariant.
	 */
	public String getBidsMeta_sequencevariant();

	/**
	 * Sets the value for bids_meta/SequenceVariant.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sequencevariant(String v);

	/**
	 * @return Returns the bids_meta/SeriesDescription.
	 */
	public String getBidsMeta_seriesdescription();

	/**
	 * Sets the value for bids_meta/SeriesDescription.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_seriesdescription(String v);

	/**
	 * @return Returns the bids_meta/SoftwareVersions.
	 */
	public String getBidsMeta_softwareversions();

	/**
	 * Sets the value for bids_meta/SoftwareVersions.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_softwareversions(String v);

	/**
	 * @return Returns the bids_meta/StationsName.
	 */
	public String getBidsMeta_stationsname();

	/**
	 * Sets the value for bids_meta/StationsName.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_stationsname(String v);

	/**
	 * @return Returns the bids_meta/dataset.
	 */
	public String getBidsMeta_dataset();

	/**
	 * Sets the value for bids_meta/dataset.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_dataset(String v);

	/**
	 * @return Returns the bids_meta/Modalisty.
	 */
	public String getBidsMeta_modalisty();

	/**
	 * Sets the value for bids_meta/Modalisty.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_modalisty(String v);

	/**
	 * @return Returns the bids_meta/subject_id.
	 */
	public String getBidsMeta_subjectId();

	/**
	 * Sets the value for bids_meta/subject_id.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_subjectId(String v);

	/**
	 * @return Returns the bids_meta/ReconMatrixPE.
	 */
	public Object getBidsMeta_reconmatrixpe();

	/**
	 * Sets the value for bids_meta/ReconMatrixPE.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_reconmatrixpe(Object v);

	/**
	 * @return Returns the bids_meta/session_id.
	 */
	public Integer getBidsMeta_sessionId();

	/**
	 * Sets the value for template:mriqcCollection/bids_meta/session_id.
	 * @param v Value to Set.
	 */
	public void setBidsMeta_sessionId(Integer v) ;

	/**
	 * @return Returns the cjv.
	 */
	public Double getCjv();

	/**
	 * Sets the value for cjv.
	 * @param v Value to Set.
	 */
	public void setCjv(Double v);

	/**
	 * @return Returns the cnr.
	 */
	public Double getCnr();

	/**
	 * Sets the value for cnr.
	 * @param v Value to Set.
	 */
	public void setCnr(Double v);

	/**
	 * @return Returns the efc.
	 */
	public Double getEfc();

	/**
	 * Sets the value for efc.
	 * @param v Value to Set.
	 */
	public void setEfc(Double v);

	/**
	 * @return Returns the fbef.
	 */
	public Double getFbef();

	/**
	 * Sets the value for fbef.
	 * @param v Value to Set.
	 */
	public void setFbef(Double v);

	/**
	 * @return Returns the fwhm_avg.
	 */
	public Double getFwhmAvg();

	/**
	 * Sets the value for fwhm_avg.
	 * @param v Value to Set.
	 */
	public void setFwhmAvg(Double v);

	/**
	 * @return Returns the fwhm_x.
	 */
	public Double getFwhmX();

	/**
	 * Sets the value for fwhm_x.
	 * @param v Value to Set.
	 */
	public void setFwhmX(Double v);

	/**
	 * @return Returns the fwhm_y.
	 */
	public Double getFwhmY();

	/**
	 * Sets the value for fwhm_y.
	 * @param v Value to Set.
	 */
	public void setFwhmY(Double v);

	/**
	 * @return Returns the fwhm_z.
	 */
	public Double getFwhmZ();

	/**
	 * Sets the value for fwhm_z.
	 * @param v Value to Set.
	 */
	public void setFwhmZ(Double v);

	/**
	 * @return Returns the icvs_csf.
	 */
	public Double getIcvsCsf();

	/**
	 * Sets the value for icvs_csf.
	 * @param v Value to Set.
	 */
	public void setIcvsCsf(Double v);

	/**
	 * @return Returns the icvs_gm.
	 */
	public Double getIcvsGm();

	/**
	 * Sets the value for icvs_gm.
	 * @param v Value to Set.
	 */
	public void setIcvsGm(Double v);

	/**
	 * @return Returns the icvs_wm.
	 */
	public Double getIcvsWm();

	/**
	 * Sets the value for icvs_wm.
	 * @param v Value to Set.
	 */
	public void setIcvsWm(Double v);

	/**
	 * @return Returns the inu_med.
	 */
	public Double getInuMed();

	/**
	 * Sets the value for inu_med.
	 * @param v Value to Set.
	 */
	public void setInuMed(Double v);

	/**
	 * @return Returns the inu_range.
	 */
	public Double getInuRange();

	/**
	 * Sets the value for inu_range.
	 * @param v Value to Set.
	 */
	public void setInuRange(Double v);

	/**
	 * @return Returns the qi_1.
	 */
	public Double getQi1();

	/**
	 * Sets the value for qi_1.
	 * @param v Value to Set.
	 */
	public void setQi1(Double v);

	/**
	 * @return Returns the qi_2.
	 */
	public Double getQi2();

	/**
	 * Sets the value for qi_2.
	 * @param v Value to Set.
	 */
	public void setQi2(Double v);

	/**
	 * @return Returns the rpve_csf.
	 */
	public Double getRpveCsf();

	/**
	 * Sets the value for rpve_csf.
	 * @param v Value to Set.
	 */
	public void setRpveCsf(Double v);

	/**
	 * @return Returns the rpve_gm.
	 */
	public Double getRpveGm();

	/**
	 * Sets the value for rpve_gm.
	 * @param v Value to Set.
	 */
	public void setRpveGm(Double v);

	/**
	 * @return Returns the rpve_wm.
	 */
	public Double getRpveWm();

	/**
	 * Sets the value for rpve_wm.
	 * @param v Value to Set.
	 */
	public void setRpveWm(Double v);

	/**
	 * @return Returns the size_x.
	 */
	public Double getSizeX();

	/**
	 * Sets the value for size_x.
	 * @param v Value to Set.
	 */
	public void setSizeX(Double v);

	/**
	 * @return Returns the size_y.
	 */
	public Double getSizeY();

	/**
	 * Sets the value for size_y.
	 * @param v Value to Set.
	 */
	public void setSizeY(Double v);

	/**
	 * @return Returns the size_z.
	 */
	public Double getSizeZ();

	/**
	 * Sets the value for size_z.
	 * @param v Value to Set.
	 */
	public void setSizeZ(Double v);

	/**
	 * @return Returns the snr_csf.
	 */
	public Double getSnrCsf();

	/**
	 * Sets the value for snr_csf.
	 * @param v Value to Set.
	 */
	public void setSnrCsf(Double v);

	/**
	 * @return Returns the snr_wm.
	 */
	public Double getSnrWm();

	/**
	 * Sets the value for snr_wm.
	 * @param v Value to Set.
	 */
	public void setSnrWm(Double v);

	/**
	 * @return Returns the snr_gm.
	 */
	public Double getSnrGm();

	/**
	 * Sets the value for snr_gm.
	 * @param v Value to Set.
	 */
	public void setSnrGm(Double v);

	/**
	 * @return Returns the snr_total.
	 */
	public Double getSnrTotal();

	/**
	 * Sets the value for snr_total.
	 * @param v Value to Set.
	 */
	public void setSnrTotal(Double v);

	/**
	 * @return Returns the snrd_csf.
	 */
	public Double getSnrdCsf();

	/**
	 * Sets the value for snrd_csf.
	 * @param v Value to Set.
	 */
	public void setSnrdCsf(Double v);

	/**
	 * @return Returns the snrd_wm.
	 */
	public Double getSnrdWm();

	/**
	 * Sets the value for snrd_wm.
	 * @param v Value to Set.
	 */
	public void setSnrdWm(Double v);

	/**
	 * @return Returns the snrd_gm.
	 */
	public Double getSnrdGm();

	/**
	 * Sets the value for snrd_gm.
	 * @param v Value to Set.
	 */
	public void setSnrdGm(Double v);

	/**
	 * @return Returns the snrd_total.
	 */
	public Double getSnrdTotal();

	/**
	 * Sets the value for snrd_total.
	 * @param v Value to Set.
	 */
	public void setSnrdTotal(Double v);

	/**
	 * @return Returns the spacing_x.
	 */
	public Double getSpacingX();

	/**
	 * Sets the value for spacing_x.
	 * @param v Value to Set.
	 */
	public void setSpacingX(Double v);

	/**
	 * @return Returns the spacing_y.
	 */
	public Double getSpacingY();

	/**
	 * Sets the value for spacing_y.
	 * @param v Value to Set.
	 */
	public void setSpacingY(Double v);

	/**
	 * @return Returns the spacing_z.
	 */
	public Double getSpacingZ();

	/**
	 * Sets the value for spacing_z.
	 * @param v Value to Set.
	 */
	public void setSpacingZ(Double v);

	/**
	 * @return Returns the summary_bg_k.
	 */
	public Double getSummaryBgK();

	/**
	 * Sets the value for summary_bg_k.
	 * @param v Value to Set.
	 */
	public void setSummaryBgK(Double v);

	/**
	 * @return Returns the summary_bg_mad.
	 */
	public Double getSummaryBgMad();

	/**
	 * Sets the value for summary_bg_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMad(Double v);

	/**
	 * @return Returns the summary_bg_mean.
	 */
	public Double getSummaryBgMean();

	/**
	 * Sets the value for summary_bg_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMean(Double v);

	/**
	 * @return Returns the summary_bg_median.
	 */
	public Double getSummaryBgMedian();

	/**
	 * Sets the value for summary_bg_median.
	 * @param v Value to Set.
	 */
	public void setSummaryBgMedian(Double v);

	/**
	 * @return Returns the summary_bg_n.
	 */
	public Double getSummaryBgN();

	/**
	 * Sets the value for summary_bg_n.
	 * @param v Value to Set.
	 */
	public void setSummaryBgN(Double v);

	/**
	 * @return Returns the summary_bg_p05.
	 */
	public Double getSummaryBgP05();

	/**
	 * Sets the value for summary_bg_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryBgP05(Double v);

	/**
	 * @return Returns the summary_bg_p95.
	 */
	public Double getSummaryBgP95();

	/**
	 * Sets the value for summary_bg_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryBgP95(Double v);

	/**
	 * @return Returns the summary_bg_stdv.
	 */
	public Double getSummaryBgStdv();

	/**
	 * Sets the value for summary_bg_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryBgStdv(Double v);

	/**
	 * @return Returns the summary_csf_k.
	 */
	public Double getSummaryCsfK();

	/**
	 * Sets the value for summary_csf_k.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfK(Double v);

	/**
	 * @return Returns the summary_csf_mad.
	 */
	public Double getSummaryCsfMad();

	/**
	 * Sets the value for summary_csf_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMad(Double v);

	/**
	 * @return Returns the summary_csf_mean.
	 */
	public Double getSummaryCsfMean();

	/**
	 * Sets the value for summary_csf_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMean(Double v);

	/**
	 * @return Returns the summary_csf_median.
	 */
	public Double getSummaryCsfMedian();

	/**
	 * Sets the value for summary_csf_median.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfMedian(Double v);

	/**
	 * @return Returns the summary_csf_n.
	 */
	public Double getSummaryCsfN();

	/**
	 * Sets the value for summary_csf_n.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfN(Double v);

	/**
	 * @return Returns the summary_csf_p05.
	 */
	public Double getSummaryCsfP05();

	/**
	 * Sets the value for summary_csf_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfP05(Double v);

	/**
	 * @return Returns the summary_csf_p95.
	 */
	public Double getSummaryCsfP95();

	/**
	 * Sets the value for summary_csf_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfP95(Double v);

	/**
	 * @return Returns the summary_csf_stdv.
	 */
	public Double getSummaryCsfStdv();

	/**
	 * Sets the value for summary_csf_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryCsfStdv(Double v);

	/**
	 * @return Returns the summary_gm_k.
	 */
	public Double getSummaryGmK();

	/**
	 * Sets the value for summary_gm_k.
	 * @param v Value to Set.
	 */
	public void setSummaryGmK(Double v);

	/**
	 * @return Returns the summary_gm_mad.
	 */
	public Double getSummaryGmMad();

	/**
	 * Sets the value for summary_gm_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMad(Double v);

	/**
	 * @return Returns the summary_gm_mean.
	 */
	public Double getSummaryGmMean();

	/**
	 * Sets the value for summary_gm_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMean(Double v);

	/**
	 * @return Returns the summary_gm_median.
	 */
	public Double getSummaryGmMedian();

	/**
	 * Sets the value for summary_gm_median.
	 * @param v Value to Set.
	 */
	public void setSummaryGmMedian(Double v);

	/**
	 * @return Returns the summary_gm_n.
	 */
	public Double getSummaryGmN();

	/**
	 * Sets the value for summary_gm_n.
	 * @param v Value to Set.
	 */
	public void setSummaryGmN(Double v);

	/**
	 * @return Returns the summary_gm_p05.
	 */
	public Double getSummaryGmP05();

	/**
	 * Sets the value for summary_gm_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryGmP05(Double v);

	/**
	 * @return Returns the summary_gm_p95.
	 */
	public Double getSummaryGmP95();

	/**
	 * Sets the value for summary_gm_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryGmP95(Double v);

	/**
	 * @return Returns the summary_gm_stdv.
	 */
	public Double getSummaryGmStdv();

	/**
	 * Sets the value for summary_gm_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryGmStdv(Double v);

	/**
	 * @return Returns the summary_wm_k.
	 */
	public Double getSummaryWmK();

	/**
	 * Sets the value for summary_wm_k.
	 * @param v Value to Set.
	 */
	public void setSummaryWmK(Double v);

	/**
	 * @return Returns the summary_wm_mad.
	 */
	public Double getSummaryWmMad();

	/**
	 * Sets the value for summary_wm_mad.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMad(Double v);

	/**
	 * @return Returns the summary_wm_mean.
	 */
	public Double getSummaryWmMean();

	/**
	 * Sets the value for summary_wm_mean.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMean(Double v);

	/**
	 * @return Returns the summary_wm_median.
	 */
	public Double getSummaryWmMedian();

	/**
	 * Sets the value for summary_wm_median.
	 * @param v Value to Set.
	 */
	public void setSummaryWmMedian(Double v);

	/**
	 * @return Returns the summary_wm_n.
	 */
	public Double getSummaryWmN();

	/**
	 * Sets the value for summary_wm_n.
	 * @param v Value to Set.
	 */
	public void setSummaryWmN(Double v);

	/**
	 * @return Returns the summary_wm_p05.
	 */
	public Double getSummaryWmP05();

	/**
	 * Sets the value for summary_wm_p05.
	 * @param v Value to Set.
	 */
	public void setSummaryWmP05(Double v);

	/**
	 * @return Returns the summary_wm_p95.
	 */
	public Double getSummaryWmP95();

	/**
	 * Sets the value for summary_wm_p95.
	 * @param v Value to Set.
	 */
	public void setSummaryWmP95(Double v);

	/**
	 * @return Returns the summary_wm_stdv.
	 */
	public Double getSummaryWmStdv();

	/**
	 * Sets the value for summary_wm_stdv.
	 * @param v Value to Set.
	 */
	public void setSummaryWmStdv(Double v);

	/**
	 * @return Returns the tpm_overlap_csf.
	 */
	public Double getTpmOverlapCsf();

	/**
	 * Sets the value for tpm_overlap_csf.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapCsf(Double v);

	/**
	 * @return Returns the tpm_overlap_gm.
	 */
	public Double getTpmOverlapGm();

	/**
	 * Sets the value for tpm_overlap_gm.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapGm(Double v);

	/**
	 * @return Returns the tpm_overlap_wm.
	 */
	public Double getTpmOverlapWm();

	/**
	 * Sets the value for tpm_overlap_wm.
	 * @param v Value to Set.
	 */
	public void setTpmOverlapWm(Double v);

	/**
	 * @return Returns the wm2max.
	 */
	public Double getWm2max();

	/**
	 * Sets the value for wm2max.
	 * @param v Value to Set.
	 */
	public void setWm2max(Double v);

	/**
	 * @return Returns the provenance/md5sum.
	 */
	public String getProvenance_md5sum();

	/**
	 * Sets the value for provenance/md5sum.
	 * @param v Value to Set.
	 */
	public void setProvenance_md5sum(String v);

	/**
	 * @return Returns the provenance/settings.
	 */
	public String getProvenance_settings();

	/**
	 * Sets the value for provenance/settings.
	 * @param v Value to Set.
	 */
	public void setProvenance_settings(String v);

	/**
	 * @return Returns the provenance/software.
	 */
	public String getProvenance_software();

	/**
	 * Sets the value for provenance/software.
	 * @param v Value to Set.
	 */
	public void setProvenance_software(String v);

	/**
	 * @return Returns the provenance/version.
	 */
	public String getProvenance_version();

	/**
	 * Sets the value for provenance/version.
	 * @param v Value to Set.
	 */
	public void setProvenance_version(String v);

	/**
	 * @return Returns the provenance/warnings.
	 */
	public String getProvenance_warnings();

	/**
	 * Sets the value for provenance/warnings.
	 * @param v Value to Set.
	 */
	public void setProvenance_warnings(String v);

	/**
	 * @return Returns the provenance/webapi_port.
	 */
	public String getProvenance_webapiPort();

	/**
	 * Sets the value for provenance/webapi_port.
	 * @param v Value to Set.
	 */
	public void setProvenance_webapiPort(String v);

	/**
	 * @return Returns the provenance/webapi_url.
	 */
	public String getProvenance_webapiUrl();

	/**
	 * Sets the value for provenance/webapi_url.
	 * @param v Value to Set.
	 */
	public void setProvenance_webapiUrl(String v);
}
