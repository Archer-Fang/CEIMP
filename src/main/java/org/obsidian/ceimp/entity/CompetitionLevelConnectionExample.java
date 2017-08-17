package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class CompetitionLevelConnectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionLevelConnectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andConnectionIdIsNull() {
            addCriterion("connection_id is null");
            return (Criteria) this;
        }

        public Criteria andConnectionIdIsNotNull() {
            addCriterion("connection_id is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionIdEqualTo(Integer value) {
            addCriterion("connection_id =", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdNotEqualTo(Integer value) {
            addCriterion("connection_id <>", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdGreaterThan(Integer value) {
            addCriterion("connection_id >", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("connection_id >=", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdLessThan(Integer value) {
            addCriterion("connection_id <", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("connection_id <=", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdIn(List<Integer> values) {
            addCriterion("connection_id in", values, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdNotIn(List<Integer> values) {
            addCriterion("connection_id not in", values, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdBetween(Integer value1, Integer value2) {
            addCriterion("connection_id between", value1, value2, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("connection_id not between", value1, value2, "connectionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdIsNull() {
            addCriterion("competition_id is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdIsNotNull() {
            addCriterion("competition_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdEqualTo(Integer value) {
            addCriterion("competition_id =", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotEqualTo(Integer value) {
            addCriterion("competition_id <>", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdGreaterThan(Integer value) {
            addCriterion("competition_id >", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_id >=", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdLessThan(Integer value) {
            addCriterion("competition_id <", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdLessThanOrEqualTo(Integer value) {
            addCriterion("competition_id <=", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdIn(List<Integer> values) {
            addCriterion("competition_id in", values, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotIn(List<Integer> values) {
            addCriterion("competition_id not in", values, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdBetween(Integer value1, Integer value2) {
            addCriterion("competition_id between", value1, value2, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_id not between", value1, value2, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdIsNull() {
            addCriterion("competition_level_id is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdIsNotNull() {
            addCriterion("competition_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdEqualTo(Integer value) {
            addCriterion("competition_level_id =", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotEqualTo(Integer value) {
            addCriterion("competition_level_id <>", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdGreaterThan(Integer value) {
            addCriterion("competition_level_id >", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_level_id >=", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdLessThan(Integer value) {
            addCriterion("competition_level_id <", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("competition_level_id <=", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdIn(List<Integer> values) {
            addCriterion("competition_level_id in", values, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotIn(List<Integer> values) {
            addCriterion("competition_level_id not in", values, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("competition_level_id between", value1, value2, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_level_id not between", value1, value2, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}