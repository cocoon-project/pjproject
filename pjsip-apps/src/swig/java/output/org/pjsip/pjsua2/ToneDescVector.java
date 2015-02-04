/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class ToneDescVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ToneDescVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ToneDescVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_ToneDescVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ToneDescVector() {
    this(pjsua2JNI.new_ToneDescVector__SWIG_0(), true);
  }

  public ToneDescVector(long n) {
    this(pjsua2JNI.new_ToneDescVector__SWIG_1(n), true);
  }

  public long size() {
    return pjsua2JNI.ToneDescVector_size(swigCPtr, this);
  }

  public long capacity() {
    return pjsua2JNI.ToneDescVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.ToneDescVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.ToneDescVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.ToneDescVector_clear(swigCPtr, this);
  }

  public void add(ToneDesc x) {
    pjsua2JNI.ToneDescVector_add(swigCPtr, this, ToneDesc.getCPtr(x), x);
  }

  public ToneDesc get(int i) {
    return new ToneDesc(pjsua2JNI.ToneDescVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, ToneDesc val) {
    pjsua2JNI.ToneDescVector_set(swigCPtr, this, i, ToneDesc.getCPtr(val), val);
  }

}