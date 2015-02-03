/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnTransportStateParam {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OnTransportStateParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnTransportStateParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_OnTransportStateParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHnd(SWIGTYPE_p_void value) {
    pjsua2JNI.OnTransportStateParam_hnd_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getHnd() {
    long cPtr = pjsua2JNI.OnTransportStateParam_hnd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setState(pjsip_transport_state value) {
    pjsua2JNI.OnTransportStateParam_state_set(swigCPtr, this, value.swigValue());
  }

  public pjsip_transport_state getState() {
    return pjsip_transport_state.swigToEnum(pjsua2JNI.OnTransportStateParam_state_get(swigCPtr, this));
  }

  public void setLastError(int value) {
    pjsua2JNI.OnTransportStateParam_lastError_set(swigCPtr, this, value);
  }

  public int getLastError() {
    return pjsua2JNI.OnTransportStateParam_lastError_get(swigCPtr, this);
  }

  public OnTransportStateParam() {
    this(pjsua2JNI.new_OnTransportStateParam(), true);
  }

}
