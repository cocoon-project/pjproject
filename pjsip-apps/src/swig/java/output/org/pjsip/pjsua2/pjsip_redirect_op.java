/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsip_redirect_op {
  public final static pjsip_redirect_op PJSIP_REDIRECT_REJECT = new pjsip_redirect_op("PJSIP_REDIRECT_REJECT");
  public final static pjsip_redirect_op PJSIP_REDIRECT_ACCEPT = new pjsip_redirect_op("PJSIP_REDIRECT_ACCEPT");
  public final static pjsip_redirect_op PJSIP_REDIRECT_ACCEPT_REPLACE = new pjsip_redirect_op("PJSIP_REDIRECT_ACCEPT_REPLACE");
  public final static pjsip_redirect_op PJSIP_REDIRECT_PENDING = new pjsip_redirect_op("PJSIP_REDIRECT_PENDING");
  public final static pjsip_redirect_op PJSIP_REDIRECT_STOP = new pjsip_redirect_op("PJSIP_REDIRECT_STOP");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsip_redirect_op swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsip_redirect_op.class + " with value " + swigValue);
  }

  private pjsip_redirect_op(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsip_redirect_op(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsip_redirect_op(String swigName, pjsip_redirect_op swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsip_redirect_op[] swigValues = { PJSIP_REDIRECT_REJECT, PJSIP_REDIRECT_ACCEPT, PJSIP_REDIRECT_ACCEPT_REPLACE, PJSIP_REDIRECT_PENDING, PJSIP_REDIRECT_STOP };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

