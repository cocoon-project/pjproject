/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjmedia_dir {
  public final static pjmedia_dir PJMEDIA_DIR_NONE = new pjmedia_dir("PJMEDIA_DIR_NONE", pjsua2JNI.PJMEDIA_DIR_NONE_get());
  public final static pjmedia_dir PJMEDIA_DIR_ENCODING = new pjmedia_dir("PJMEDIA_DIR_ENCODING", pjsua2JNI.PJMEDIA_DIR_ENCODING_get());
  public final static pjmedia_dir PJMEDIA_DIR_CAPTURE = new pjmedia_dir("PJMEDIA_DIR_CAPTURE", pjsua2JNI.PJMEDIA_DIR_CAPTURE_get());
  public final static pjmedia_dir PJMEDIA_DIR_DECODING = new pjmedia_dir("PJMEDIA_DIR_DECODING", pjsua2JNI.PJMEDIA_DIR_DECODING_get());
  public final static pjmedia_dir PJMEDIA_DIR_PLAYBACK = new pjmedia_dir("PJMEDIA_DIR_PLAYBACK", pjsua2JNI.PJMEDIA_DIR_PLAYBACK_get());
  public final static pjmedia_dir PJMEDIA_DIR_RENDER = new pjmedia_dir("PJMEDIA_DIR_RENDER", pjsua2JNI.PJMEDIA_DIR_RENDER_get());
  public final static pjmedia_dir PJMEDIA_DIR_ENCODING_DECODING = new pjmedia_dir("PJMEDIA_DIR_ENCODING_DECODING", pjsua2JNI.PJMEDIA_DIR_ENCODING_DECODING_get());
  public final static pjmedia_dir PJMEDIA_DIR_CAPTURE_PLAYBACK = new pjmedia_dir("PJMEDIA_DIR_CAPTURE_PLAYBACK", pjsua2JNI.PJMEDIA_DIR_CAPTURE_PLAYBACK_get());
  public final static pjmedia_dir PJMEDIA_DIR_CAPTURE_RENDER = new pjmedia_dir("PJMEDIA_DIR_CAPTURE_RENDER", pjsua2JNI.PJMEDIA_DIR_CAPTURE_RENDER_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjmedia_dir swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjmedia_dir.class + " with value " + swigValue);
  }

  private pjmedia_dir(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjmedia_dir(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjmedia_dir(String swigName, pjmedia_dir swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjmedia_dir[] swigValues = { PJMEDIA_DIR_NONE, PJMEDIA_DIR_ENCODING, PJMEDIA_DIR_CAPTURE, PJMEDIA_DIR_DECODING, PJMEDIA_DIR_PLAYBACK, PJMEDIA_DIR_RENDER, PJMEDIA_DIR_ENCODING_DECODING, PJMEDIA_DIR_CAPTURE_PLAYBACK, PJMEDIA_DIR_CAPTURE_RENDER };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
