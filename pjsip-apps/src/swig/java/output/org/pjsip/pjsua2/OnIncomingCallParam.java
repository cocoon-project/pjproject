/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnIncomingCallParam {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OnIncomingCallParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnIncomingCallParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_OnIncomingCallParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCallId(int value) {
    pjsua2JNI.OnIncomingCallParam_callId_set(swigCPtr, this, value);
  }

  public int getCallId() {
    return pjsua2JNI.OnIncomingCallParam_callId_get(swigCPtr, this);
  }

  public void setRdata(SipRxData value) {
    pjsua2JNI.OnIncomingCallParam_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
  }

  public SipRxData getRdata() {
    long cPtr = pjsua2JNI.OnIncomingCallParam_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipRxData(cPtr, false);
  }

  public OnIncomingCallParam() {
    this(pjsua2JNI.new_OnIncomingCallParam(), true);
  }

}
