package sd.mtn.Data;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;


        public  class SubscrState {
          //JAXBElement<Integer> 
 
             String firstActiveDate;
          
             String lastRechargeTime;
          
             String activeCAC;
          
             String activeStop;
         
             String suspendStop;
          
             String disableStop;
          
           Integer lifeCycleState;
       
             Integer dpFlag;
        
             Integer fraudState;
     
             Integer lossFlag;
     
             String dpEndDate;

           Integer dpFlag1;

            Integer dpFlag2;

             String lastActiveDate;

            Integer posUserState;
            Integer etuFraudState;


    public void setFirstActiveDate(String firstActiveDate) {
        this.firstActiveDate = firstActiveDate;
    }

    public String getFirstActiveDate() {
        return firstActiveDate;
    }

    public void setLastRechargeTime(String lastRechargeTime) {
        this.lastRechargeTime = lastRechargeTime;
    }

    public String getLastRechargeTime() {
        return lastRechargeTime;
    }

    public void setActiveCAC(String activeCAC) {
        this.activeCAC = activeCAC;
    }

    public String getActiveCAC() {
        return activeCAC;
    }

    public void setActiveStop(String activeStop) {
        this.activeStop = activeStop;
    }

    public String getActiveStop() {
        return activeStop;
    }

    public void setSuspendStop(String suspendStop) {
        this.suspendStop = suspendStop;
    }

    public String getSuspendStop() {
        return suspendStop;
    }

    public void setDisableStop(String disableStop) {
        this.disableStop = disableStop;
    }

    public String getDisableStop() {
        return disableStop;
    }

   

    public void setDpFlag(Integer dpFlag) {
        this.dpFlag = dpFlag;
    }

    public Integer getDpFlag() {
        return dpFlag;
    }

    public void setFraudState(Integer fraudState) {
        this.fraudState = fraudState;
    }

    public Integer getFraudState() {
        return fraudState;
    }

    public void setLossFlag(Integer lossFlag) {
        this.lossFlag = lossFlag;
    }

    public Integer getLossFlag() {
        return lossFlag;
    }

    public void setDpEndDate(String dpEndDate) {
        this.dpEndDate = dpEndDate;
    }

    public String getDpEndDate() {
        return dpEndDate;
    }

    public void setDpFlag1(Integer dpFlag1) {
        this.dpFlag1 = dpFlag1;
    }

    public Integer getDpFlag1() {
        return dpFlag1;
    }

    public void setDpFlag2(Integer dpFlag2) {
        this.dpFlag2 = dpFlag2;
    }

    public Integer getDpFlag2() {
        return dpFlag2;
    }

    public void setLastActiveDate(String lastActiveDate) {
        this.lastActiveDate = lastActiveDate;
    }

    public String getLastActiveDate() {
        return lastActiveDate;
    }

    public void setPosUserState(Integer posUserState) {
        this.posUserState = posUserState;
    }

    public Integer getPosUserState() {
        return posUserState;
    }

    public void setEtuFraudState(Integer etuFraudState) {
        this.etuFraudState = etuFraudState;
    }

    public Integer getEtuFraudState() {
        return etuFraudState;
    }

    public void setLifeCycleState(Integer lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    public Integer getLifeCycleState() {
        return lifeCycleState;
    }
}
