/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.payments;

@SuppressWarnings("all")
public final class PaymentTaxRate implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }
  public java.lang.String getName() {
    return cacheGet(CacheKey.name);
  }
  public java.lang.Long getRate() {
    return cacheGet(CacheKey.rate);
  }
  public java.lang.Boolean getIsDefault() {
    return cacheGet(CacheKey.isDefault);
  }
  public java.lang.Long getTaxableAmount() {
    return cacheGet(CacheKey.taxableAmount);
  }


  private enum CacheKey {
    id {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.extractId();
      }
    },
    name {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.extractName();
      }
    },
    rate {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.extractRate();
      }
    },
    isDefault {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.extractIsDefault();
      }
    },
    taxableAmount {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.extractTaxableAmount();
      }
    },
    ;

    public abstract Object extractValue(PaymentTaxRate instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public PaymentTaxRate() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentTaxRate(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PaymentTaxRate(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentTaxRate(PaymentTaxRate src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String id = getId();
    if (id != null && id.length() > 13) { throw new IllegalArgumentException("Maximum string length exceeded for 'id'");}

    java.lang.String name = getName();
    if (name == null) throw new java.lang.IllegalArgumentException("'name' is required to be non-null");
    if (name != null && name.length() > 127) { throw new IllegalArgumentException("Maximum string length exceeded for 'name'");}

    java.lang.Long rate = getRate();
    if (rate == null) throw new java.lang.IllegalArgumentException("'rate' is required to be non-null");
    if (rate != null && ( rate < 0)) throw new IllegalArgumentException("Invalid value for 'rate'");

    java.lang.Long taxableAmount = getTaxableAmount();
    if (taxableAmount == null) throw new java.lang.IllegalArgumentException("'taxableAmount' is required to be non-null");
  }



  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }


  private java.lang.String extractName() {
    return getJSONObject().isNull("name") ? null :
      getJSONObject().optString("name");
  }


  private java.lang.Long extractRate() {
    return getJSONObject().isNull("rate") ? null :
      getJSONObject().optLong("rate");
  }


  private java.lang.Boolean extractIsDefault() {
    return getJSONObject().isNull("isDefault") ? null :
      getJSONObject().optBoolean("isDefault");
  }


  private java.lang.Long extractTaxableAmount() {
    return getJSONObject().isNull("taxableAmount") ? null :
      getJSONObject().optLong("taxableAmount");
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'rate' field is set and is not null */
  public boolean isNotNullRate() {
    return cacheValueIsNotNull(CacheKey.rate);
  }

  /** Checks whether the 'isDefault' field is set and is not null */
  public boolean isNotNullIsDefault() {
    return cacheValueIsNotNull(CacheKey.isDefault);
  }

  /** Checks whether the 'taxableAmount' field is set and is not null */
  public boolean isNotNullTaxableAmount() {
    return cacheValueIsNotNull(CacheKey.taxableAmount);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'rate' field has been set, however the value could be null */
  public boolean hasRate() {
    return cacheHasKey(CacheKey.rate);
  }

  /** Checks whether the 'isDefault' field has been set, however the value could be null */
  public boolean hasIsDefault() {
    return cacheHasKey(CacheKey.isDefault);
  }

  /** Checks whether the 'taxableAmount' field has been set, however the value could be null */
  public boolean hasTaxableAmount() {
    return cacheHasKey(CacheKey.taxableAmount);
  }


  /**
   * Sets the field 'id'.
   */
  public PaymentTaxRate setId(java.lang.String id) {
    logChange("id");

    try {
      getJSONObject().put("id", id == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(id));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.id);
    return this;
  }

  /**
   * Sets the field 'name'.
   */
  public PaymentTaxRate setName(java.lang.String name) {
    logChange("name");

    try {
      getJSONObject().put("name", name == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(name));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.name);
    return this;
  }

  /**
   * Sets the field 'rate'.
   */
  public PaymentTaxRate setRate(java.lang.Long rate) {
    logChange("rate");

    try {
      getJSONObject().put("rate", rate == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(rate));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.rate);
    return this;
  }

  /**
   * Sets the field 'isDefault'.
   */
  public PaymentTaxRate setIsDefault(java.lang.Boolean isDefault) {
    logChange("isDefault");

    try {
      getJSONObject().put("isDefault", isDefault == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(isDefault));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.isDefault);
    return this;
  }

  /**
   * Sets the field 'taxableAmount'.
   */
  public PaymentTaxRate setTaxableAmount(java.lang.Long taxableAmount) {
    logChange("taxableAmount");

    try {
      getJSONObject().put("taxableAmount", taxableAmount == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(taxableAmount));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.taxableAmount);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    unlogChange("name");
    getJSONObject().remove("name");
    cacheRemoveValue(CacheKey.name);
  }

  /** Clears the 'rate' field, the 'has' method for this field will now return false */
  public void clearRate() {
    unlogChange("rate");
    getJSONObject().remove("rate");
    cacheRemoveValue(CacheKey.rate);
  }

  /** Clears the 'isDefault' field, the 'has' method for this field will now return false */
  public void clearIsDefault() {
    unlogChange("isDefault");
    getJSONObject().remove("isDefault");
    cacheRemoveValue(CacheKey.isDefault);
  }

  /** Clears the 'taxableAmount' field, the 'has' method for this field will now return false */
  public void clearTaxableAmount() {
    unlogChange("taxableAmount");
    getJSONObject().remove("taxableAmount");
    cacheRemoveValue(CacheKey.taxableAmount);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public PaymentTaxRate copyChanges() {
    PaymentTaxRate copy = new PaymentTaxRate();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentTaxRate src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new PaymentTaxRate(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "PaymentTaxRate{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<PaymentTaxRate> CREATOR = new android.os.Parcelable.Creator<PaymentTaxRate>() {
    @Override
    public PaymentTaxRate createFromParcel(android.os.Parcel in) {
      PaymentTaxRate instance = new PaymentTaxRate(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public PaymentTaxRate[] newArray(int size) {
      return new PaymentTaxRate[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentTaxRate> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentTaxRate>() {
    @Override
    public PaymentTaxRate create(org.json.JSONObject jsonObject) {
      return new PaymentTaxRate(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 127;

    public static final boolean RATE_IS_REQUIRED = true;
    public static final long RATE_MIN = 0;

    public static final boolean ISDEFAULT_IS_REQUIRED = false;

    public static final boolean TAXABLEAMOUNT_IS_REQUIRED = true;

  }

}
