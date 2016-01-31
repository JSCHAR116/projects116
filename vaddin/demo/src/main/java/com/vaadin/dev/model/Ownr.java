package com.vaadin.dev.model;
// Generated Nov 25, 2015 8:58:03 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Ownr generated by hbm2java
 */
@Entity
@Table(name="OWNR"
    ,catalog="Tag"
)
public class Ownr  implements java.io.Serializable {


     private OwnrId id;

    public Ownr() {
    }

    public Ownr(OwnrId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="ownrId", column=@Column(name="OWNR_ID", scale=0) ), 
        @AttributeOverride(name="ownrFrstNm", column=@Column(name="OWNR_FRST_NM", length=33) ), 
        @AttributeOverride(name="ownrLastNm", column=@Column(name="OWNR_LAST_NM", length=33) ), 
        @AttributeOverride(name="ownrBsnsNm", column=@Column(name="OWNR_BSNS_NM", length=60) ), 
        @AttributeOverride(name="effctvDt", column=@Column(name="EFFCTV_DT", length=19) ), 
        @AttributeOverride(name="endDt", column=@Column(name="END_DT", length=19) ), 
        @AttributeOverride(name="ownrTypeId", column=@Column(name="OWNR_TYPE_ID", precision=2, scale=0) ), 
        @AttributeOverride(name="sfxTypeId", column=@Column(name="SFX_TYPE_ID", precision=3, scale=0) ), 
        @AttributeOverride(name="createUserId", column=@Column(name="CREATE_USER_ID", length=80) ), 
        @AttributeOverride(name="createDt", column=@Column(name="CREATE_DT", length=19) ), 
        @AttributeOverride(name="updtUserId", column=@Column(name="UPDT_USER_ID", length=80) ), 
        @AttributeOverride(name="updtDt", column=@Column(name="UPDT_DT", length=19) ), 
        @AttributeOverride(name="ownrMdlInitlTxt", column=@Column(name="OWNR_MDL_INITL_TXT", length=2) ) } )
    public OwnrId getId() {
        return this.id;
    }
    
    public void setId(OwnrId id) {
        this.id = id;
    }




}

