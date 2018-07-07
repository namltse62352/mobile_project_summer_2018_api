package fptu.summer.model;
// Generated Jun 3, 2018 2:37:40 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import fptu.summer.model.enumeration.LedgerStatus;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ledger generated by hbm2java
 */
public class Ledger implements java.io.Serializable {

    @JsonProperty("local_id")
    private Long localId;
    @JsonProperty("server_id")
    private Long id;
    private String name;
    private String currency;
    private boolean countedOnReport;
    private Date insertDate;
    private Date lastUpdate;
    private int status = LedgerStatus.ENABLE.getStatus();
    @JsonIgnore
    private Set<Transaction> transactions = new HashSet(0);
    @JsonIgnore
    private Set<TransactionGroup> transactionGroups = new HashSet(0);
    @JsonIgnore
    private Integer userId;

    public Ledger() {
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isCountedOnReport() {
        return this.countedOnReport;
    }

    public void setCountedOnReport(boolean countedOnReport) {
        this.countedOnReport = countedOnReport;
    }

    public Date getInsertDate() {
        return this.insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Set<TransactionGroup> getTransactionGroups() {
        return this.transactionGroups;
    }

    public void setTransactionGroups(Set<TransactionGroup> transactionGroups) {
        this.transactionGroups = transactionGroups;
    }

}
