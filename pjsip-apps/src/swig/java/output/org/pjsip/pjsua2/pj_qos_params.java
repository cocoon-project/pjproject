/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class pj_qos_params {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pj_qos_params(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pj_qos_params obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_pj_qos_params(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFlags(short value) {
    pjsua2JNI.pj_qos_params_flags_set(swigCPtr, this, value);
  }

  public short getFlags() {
    return pjsua2JNI.pj_qos_params_flags_get(swigCPtr, this);
  }

  public void setDscp_val(short value) {
    pjsua2JNI.pj_qos_params_dscp_val_set(swigCPtr, this, value);
  }

  public short getDscp_val() {
    return pjsua2JNI.pj_qos_params_dscp_val_get(swigCPtr, this);
  }

  public void setSo_prio(short value) {
    pjsua2JNI.pj_qos_params_so_prio_set(swigCPtr, this, value);
  }

  public short getSo_prio() {
    return pjsua2JNI.pj_qos_params_so_prio_get(swigCPtr, this);
  }

  public void setWmm_prio(pj_qos_wmm_prio value) {
    pjsua2JNI.pj_qos_params_wmm_prio_set(swigCPtr, this, value.swigValue());
  }

  public pj_qos_wmm_prio getWmm_prio() {
    return pj_qos_wmm_prio.swigToEnum(pjsua2JNI.pj_qos_params_wmm_prio_get(swigCPtr, this));
  }

  public pj_qos_params() {
    this(pjsua2JNI.new_pj_qos_params(), true);
  }

}
