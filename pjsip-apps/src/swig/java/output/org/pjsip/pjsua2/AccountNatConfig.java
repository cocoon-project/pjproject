/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AccountNatConfig extends PersistentObject {
  private long swigCPtr;

  protected AccountNatConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.AccountNatConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AccountNatConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_AccountNatConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setSipStunUse(pjsua_stun_use value) {
    pjsua2JNI.AccountNatConfig_sipStunUse_set(swigCPtr, this, value.swigValue());
  }

  public pjsua_stun_use getSipStunUse() {
    return pjsua_stun_use.swigToEnum(pjsua2JNI.AccountNatConfig_sipStunUse_get(swigCPtr, this));
  }

  public void setMediaStunUse(pjsua_stun_use value) {
    pjsua2JNI.AccountNatConfig_mediaStunUse_set(swigCPtr, this, value.swigValue());
  }

  public pjsua_stun_use getMediaStunUse() {
    return pjsua_stun_use.swigToEnum(pjsua2JNI.AccountNatConfig_mediaStunUse_get(swigCPtr, this));
  }

  public void setIceEnabled(boolean value) {
    pjsua2JNI.AccountNatConfig_iceEnabled_set(swigCPtr, this, value);
  }

  public boolean getIceEnabled() {
    return pjsua2JNI.AccountNatConfig_iceEnabled_get(swigCPtr, this);
  }

  public void setIceMaxHostCands(int value) {
    pjsua2JNI.AccountNatConfig_iceMaxHostCands_set(swigCPtr, this, value);
  }

  public int getIceMaxHostCands() {
    return pjsua2JNI.AccountNatConfig_iceMaxHostCands_get(swigCPtr, this);
  }

  public void setIceAggressiveNomination(boolean value) {
    pjsua2JNI.AccountNatConfig_iceAggressiveNomination_set(swigCPtr, this, value);
  }

  public boolean getIceAggressiveNomination() {
    return pjsua2JNI.AccountNatConfig_iceAggressiveNomination_get(swigCPtr, this);
  }

  public void setIceNominatedCheckDelayMsec(long value) {
    pjsua2JNI.AccountNatConfig_iceNominatedCheckDelayMsec_set(swigCPtr, this, value);
  }

  public long getIceNominatedCheckDelayMsec() {
    return pjsua2JNI.AccountNatConfig_iceNominatedCheckDelayMsec_get(swigCPtr, this);
  }

  public void setIceWaitNominationTimeoutMsec(int value) {
    pjsua2JNI.AccountNatConfig_iceWaitNominationTimeoutMsec_set(swigCPtr, this, value);
  }

  public int getIceWaitNominationTimeoutMsec() {
    return pjsua2JNI.AccountNatConfig_iceWaitNominationTimeoutMsec_get(swigCPtr, this);
  }

  public void setIceNoRtcp(boolean value) {
    pjsua2JNI.AccountNatConfig_iceNoRtcp_set(swigCPtr, this, value);
  }

  public boolean getIceNoRtcp() {
    return pjsua2JNI.AccountNatConfig_iceNoRtcp_get(swigCPtr, this);
  }

  public void setIceAlwaysUpdate(boolean value) {
    pjsua2JNI.AccountNatConfig_iceAlwaysUpdate_set(swigCPtr, this, value);
  }

  public boolean getIceAlwaysUpdate() {
    return pjsua2JNI.AccountNatConfig_iceAlwaysUpdate_get(swigCPtr, this);
  }

  public void setTurnEnabled(boolean value) {
    pjsua2JNI.AccountNatConfig_turnEnabled_set(swigCPtr, this, value);
  }

  public boolean getTurnEnabled() {
    return pjsua2JNI.AccountNatConfig_turnEnabled_get(swigCPtr, this);
  }

  public void setTurnServer(String value) {
    pjsua2JNI.AccountNatConfig_turnServer_set(swigCPtr, this, value);
  }

  public String getTurnServer() {
    return pjsua2JNI.AccountNatConfig_turnServer_get(swigCPtr, this);
  }

  public void setTurnConnType(pj_turn_tp_type value) {
    pjsua2JNI.AccountNatConfig_turnConnType_set(swigCPtr, this, value.swigValue());
  }

  public pj_turn_tp_type getTurnConnType() {
    return pj_turn_tp_type.swigToEnum(pjsua2JNI.AccountNatConfig_turnConnType_get(swigCPtr, this));
  }

  public void setTurnUserName(String value) {
    pjsua2JNI.AccountNatConfig_turnUserName_set(swigCPtr, this, value);
  }

  public String getTurnUserName() {
    return pjsua2JNI.AccountNatConfig_turnUserName_get(swigCPtr, this);
  }

  public void setTurnPasswordType(int value) {
    pjsua2JNI.AccountNatConfig_turnPasswordType_set(swigCPtr, this, value);
  }

  public int getTurnPasswordType() {
    return pjsua2JNI.AccountNatConfig_turnPasswordType_get(swigCPtr, this);
  }

  public void setTurnPassword(String value) {
    pjsua2JNI.AccountNatConfig_turnPassword_set(swigCPtr, this, value);
  }

  public String getTurnPassword() {
    return pjsua2JNI.AccountNatConfig_turnPassword_get(swigCPtr, this);
  }

  public void setContactRewriteUse(int value) {
    pjsua2JNI.AccountNatConfig_contactRewriteUse_set(swigCPtr, this, value);
  }

  public int getContactRewriteUse() {
    return pjsua2JNI.AccountNatConfig_contactRewriteUse_get(swigCPtr, this);
  }

  public void setContactRewriteMethod(int value) {
    pjsua2JNI.AccountNatConfig_contactRewriteMethod_set(swigCPtr, this, value);
  }

  public int getContactRewriteMethod() {
    return pjsua2JNI.AccountNatConfig_contactRewriteMethod_get(swigCPtr, this);
  }

  public void setContactUseSrcPort(int value) {
    pjsua2JNI.AccountNatConfig_contactUseSrcPort_set(swigCPtr, this, value);
  }

  public int getContactUseSrcPort() {
    return pjsua2JNI.AccountNatConfig_contactUseSrcPort_get(swigCPtr, this);
  }

  public void setViaRewriteUse(int value) {
    pjsua2JNI.AccountNatConfig_viaRewriteUse_set(swigCPtr, this, value);
  }

  public int getViaRewriteUse() {
    return pjsua2JNI.AccountNatConfig_viaRewriteUse_get(swigCPtr, this);
  }

  public void setSdpNatRewriteUse(int value) {
    pjsua2JNI.AccountNatConfig_sdpNatRewriteUse_set(swigCPtr, this, value);
  }

  public int getSdpNatRewriteUse() {
    return pjsua2JNI.AccountNatConfig_sdpNatRewriteUse_get(swigCPtr, this);
  }

  public void setSipOutboundUse(int value) {
    pjsua2JNI.AccountNatConfig_sipOutboundUse_set(swigCPtr, this, value);
  }

  public int getSipOutboundUse() {
    return pjsua2JNI.AccountNatConfig_sipOutboundUse_get(swigCPtr, this);
  }

  public void setSipOutboundInstanceId(String value) {
    pjsua2JNI.AccountNatConfig_sipOutboundInstanceId_set(swigCPtr, this, value);
  }

  public String getSipOutboundInstanceId() {
    return pjsua2JNI.AccountNatConfig_sipOutboundInstanceId_get(swigCPtr, this);
  }

  public void setSipOutboundRegId(String value) {
    pjsua2JNI.AccountNatConfig_sipOutboundRegId_set(swigCPtr, this, value);
  }

  public String getSipOutboundRegId() {
    return pjsua2JNI.AccountNatConfig_sipOutboundRegId_get(swigCPtr, this);
  }

  public void setUdpKaIntervalSec(long value) {
    pjsua2JNI.AccountNatConfig_udpKaIntervalSec_set(swigCPtr, this, value);
  }

  public long getUdpKaIntervalSec() {
    return pjsua2JNI.AccountNatConfig_udpKaIntervalSec_get(swigCPtr, this);
  }

  public void setUdpKaData(String value) {
    pjsua2JNI.AccountNatConfig_udpKaData_set(swigCPtr, this, value);
  }

  public String getUdpKaData() {
    return pjsua2JNI.AccountNatConfig_udpKaData_get(swigCPtr, this);
  }

  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.AccountNatConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.AccountNatConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public AccountNatConfig() {
    this(pjsua2JNI.new_AccountNatConfig(), true);
  }

}
