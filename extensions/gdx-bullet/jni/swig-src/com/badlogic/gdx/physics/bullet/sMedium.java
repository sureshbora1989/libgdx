/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class sMedium {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected sMedium(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(sMedium obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_sMedium(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_velocity(btVector3 value) {
    gdxBulletJNI.sMedium_m_velocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_velocity() {
    long cPtr = gdxBulletJNI.sMedium_m_velocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_pressure(float value) {
    gdxBulletJNI.sMedium_m_pressure_set(swigCPtr, this, value);
  }

  public float getM_pressure() {
    return gdxBulletJNI.sMedium_m_pressure_get(swigCPtr, this);
  }

  public void setM_density(float value) {
    gdxBulletJNI.sMedium_m_density_set(swigCPtr, this, value);
  }

  public float getM_density() {
    return gdxBulletJNI.sMedium_m_density_get(swigCPtr, this);
  }

  public sMedium() {
    this(gdxBulletJNI.new_sMedium(), true);
  }

}
