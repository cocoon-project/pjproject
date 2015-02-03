/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SipEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SipEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_SipEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(pjsip_event_id_e value) {
    pjsua2JNI.SipEvent_type_set(swigCPtr, this, value.swigValue());
  }

  public pjsip_event_id_e getType() {
    return pjsip_event_id_e.swigToEnum(pjsua2JNI.SipEvent_type_get(swigCPtr, this));
  }

  public void setPjEvent(SWIGTYPE_p_void value) {
    pjsua2JNI.SipEvent_pjEvent_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getPjEvent() {
    long cPtr = pjsua2JNI.SipEvent_pjEvent_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SipEvent() {
    this(pjsua2JNI.new_SipEvent(), true);
  }

}
