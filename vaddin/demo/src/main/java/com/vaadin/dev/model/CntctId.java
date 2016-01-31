package com.vaadin.dev.model;
// Generated Nov 25, 2015 8:58:03 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CntctId generated by hbm2java
 */
@Embeddable
public class CntctId  implements java.io.Serializable {


     private BigDecimal addrId;
     private BigDecimal cntctId;
     private BigDecimal othrCntctId;
     private String createUserId;
     private Date createDt;
     private String updtUserId;
     private Date updtDt;
     private BigDecimal cntctTypeId;

    public CntctId() {
    }

    public CntctId(BigDecimal addrId, BigDecimal cntctId, BigDecimal othrCntctId, String createUserId, Date createDt, String updtUserId, Date updtDt, BigDecimal cntctTypeId) {
       this.addrId = addrId;
       this.cntctId = cntctId;
       this.othrCntctId = othrCntctId;
       this.createUserId = createUserId;
       this.createDt = createDt;
       this.updtUserId = updtUserId;
       this.updtDt = updtDt;
       this.cntctTypeId = cntctTypeId;
    }
   


    @Column(name="ADDR_ID", scale=0)
    public BigDecimal getAddrId() {
        return this.addrId;
    }
    
    public void setAddrId(BigDecimal addrId) {
        this.addrId = addrId;
    }


    @Column(name="CNTCT_ID", scale=0)
    public BigDecimal getCntctId() {
        return this.cntctId;
    }
    
    public void setCntctId(BigDecimal cntctId) {
        this.cntctId = cntctId;
    }


    @Column(name="OTHR_CNTCT_ID", scale=0)
    public BigDecimal getOthrCntctId() {
        return this.othrCntctId;
    }
    
    public void setOthrCntctId(BigDecimal othrCntctId) {
        this.othrCntctId = othrCntctId;
    }


    @Column(name="CREATE_USER_ID", length=80)
    public String getCreateUserId() {
        return this.createUserId;
    }
    
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }


    @Column(name="CREATE_DT", length=19)
    public Date getCreateDt() {
        return this.createDt;
    }
    
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }


    @Column(name="UPDT_USER_ID", length=80)
    public String getUpdtUserId() {
        return this.updtUserId;
    }
    
    public void setUpdtUserId(String updtUserId) {
        this.updtUserId = updtUserId;
    }


    @Column(name="UPDT_DT", length=19)
    public Date getUpdtDt() {
        return this.updtDt;
    }
    
    public void setUpdtDt(Date updtDt) {
        this.updtDt = updtDt;
    }


    @Column(name="CNTCT_TYPE_ID", scale=0)
    public BigDecimal getCntctTypeId() {
        return this.cntctTypeId;
    }
    
    public void setCntctTypeId(BigDecimal cntctTypeId) {
        this.cntctTypeId = cntctTypeId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CntctId) ) return false;
		 CntctId castOther = ( CntctId ) other; 
         
		 return ( (this.getAddrId()==castOther.getAddrId()) || ( this.getAddrId()!=null && castOther.getAddrId()!=null && this.getAddrId().equals(castOther.getAddrId()) ) )
 && ( (this.getCntctId()==castOther.getCntctId()) || ( this.getCntctId()!=null && castOther.getCntctId()!=null && this.getCntctId().equals(castOther.getCntctId()) ) )
 && ( (this.getOthrCntctId()==castOther.getOthrCntctId()) || ( this.getOthrCntctId()!=null && castOther.getOthrCntctId()!=null && this.getOthrCntctId().equals(castOther.getOthrCntctId()) ) )
 && ( (this.getCreateUserId()==castOther.getCreateUserId()) || ( this.getCreateUserId()!=null && castOther.getCreateUserId()!=null && this.getCreateUserId().equals(castOther.getCreateUserId()) ) )
 && ( (this.getCreateDt()==castOther.getCreateDt()) || ( this.getCreateDt()!=null && castOther.getCreateDt()!=null && this.getCreateDt().equals(castOther.getCreateDt()) ) )
 && ( (this.getUpdtUserId()==castOther.getUpdtUserId()) || ( this.getUpdtUserId()!=null && castOther.getUpdtUserId()!=null && this.getUpdtUserId().equals(castOther.getUpdtUserId()) ) )
 && ( (this.getUpdtDt()==castOther.getUpdtDt()) || ( this.getUpdtDt()!=null && castOther.getUpdtDt()!=null && this.getUpdtDt().equals(castOther.getUpdtDt()) ) )
 && ( (this.getCntctTypeId()==castOther.getCntctTypeId()) || ( this.getCntctTypeId()!=null && castOther.getCntctTypeId()!=null && this.getCntctTypeId().equals(castOther.getCntctTypeId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAddrId() == null ? 0 : this.getAddrId().hashCode() );
         result = 37 * result + ( getCntctId() == null ? 0 : this.getCntctId().hashCode() );
         result = 37 * result + ( getOthrCntctId() == null ? 0 : this.getOthrCntctId().hashCode() );
         result = 37 * result + ( getCreateUserId() == null ? 0 : this.getCreateUserId().hashCode() );
         result = 37 * result + ( getCreateDt() == null ? 0 : this.getCreateDt().hashCode() );
         result = 37 * result + ( getUpdtUserId() == null ? 0 : this.getUpdtUserId().hashCode() );
         result = 37 * result + ( getUpdtDt() == null ? 0 : this.getUpdtDt().hashCode() );
         result = 37 * result + ( getCntctTypeId() == null ? 0 : this.getCntctTypeId().hashCode() );
         return result;
   }   


}

