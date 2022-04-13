package com.hnitoj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(Integer value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(Integer value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(Integer value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(Integer value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<Integer> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<Integer> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSpjIsNull() {
            addCriterion("spj is null");
            return (Criteria) this;
        }

        public Criteria andSpjIsNotNull() {
            addCriterion("spj is not null");
            return (Criteria) this;
        }

        public Criteria andSpjEqualTo(String value) {
            addCriterion("spj =", value, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjNotEqualTo(String value) {
            addCriterion("spj <>", value, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjGreaterThan(String value) {
            addCriterion("spj >", value, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjGreaterThanOrEqualTo(String value) {
            addCriterion("spj >=", value, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjLessThan(String value) {
            addCriterion("spj <", value, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjLessThanOrEqualTo(String value) {
            addCriterion("spj <=", value, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjLike(String value) {
            addCriterion("spj like", value, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjNotLike(String value) {
            addCriterion("spj not like", value, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjIn(List<String> values) {
            addCriterion("spj in", values, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjNotIn(List<String> values) {
            addCriterion("spj not in", values, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjBetween(String value1, String value2) {
            addCriterion("spj between", value1, value2, "spj");
            return (Criteria) this;
        }

        public Criteria andSpjNotBetween(String value1, String value2) {
            addCriterion("spj not between", value1, value2, "spj");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("in_date is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("in_date is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(Date value) {
            addCriterion("in_date =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(Date value) {
            addCriterion("in_date <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(Date value) {
            addCriterion("in_date >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("in_date >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(Date value) {
            addCriterion("in_date <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(Date value) {
            addCriterion("in_date <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<Date> values) {
            addCriterion("in_date in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<Date> values) {
            addCriterion("in_date not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(Date value1, Date value2) {
            addCriterion("in_date between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(Date value1, Date value2) {
            addCriterion("in_date not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Integer value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Integer value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Integer value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Integer value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Integer> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Integer> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitIsNull() {
            addCriterion("memory_limit is null");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitIsNotNull() {
            addCriterion("memory_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitEqualTo(Integer value) {
            addCriterion("memory_limit =", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitNotEqualTo(Integer value) {
            addCriterion("memory_limit <>", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitGreaterThan(Integer value) {
            addCriterion("memory_limit >", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory_limit >=", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitLessThan(Integer value) {
            addCriterion("memory_limit <", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitLessThanOrEqualTo(Integer value) {
            addCriterion("memory_limit <=", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitIn(List<Integer> values) {
            addCriterion("memory_limit in", values, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitNotIn(List<Integer> values) {
            addCriterion("memory_limit not in", values, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitBetween(Integer value1, Integer value2) {
            addCriterion("memory_limit between", value1, value2, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("memory_limit not between", value1, value2, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andDefunctIsNull() {
            addCriterion("defunct is null");
            return (Criteria) this;
        }

        public Criteria andDefunctIsNotNull() {
            addCriterion("defunct is not null");
            return (Criteria) this;
        }

        public Criteria andDefunctEqualTo(String value) {
            addCriterion("defunct =", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctNotEqualTo(String value) {
            addCriterion("defunct <>", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctGreaterThan(String value) {
            addCriterion("defunct >", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctGreaterThanOrEqualTo(String value) {
            addCriterion("defunct >=", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctLessThan(String value) {
            addCriterion("defunct <", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctLessThanOrEqualTo(String value) {
            addCriterion("defunct <=", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctLike(String value) {
            addCriterion("defunct like", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctNotLike(String value) {
            addCriterion("defunct not like", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctIn(List<String> values) {
            addCriterion("defunct in", values, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctNotIn(List<String> values) {
            addCriterion("defunct not in", values, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctBetween(String value1, String value2) {
            addCriterion("defunct between", value1, value2, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctNotBetween(String value1, String value2) {
            addCriterion("defunct not between", value1, value2, "defunct");
            return (Criteria) this;
        }

        public Criteria andAcceptedIsNull() {
            addCriterion("accepted is null");
            return (Criteria) this;
        }

        public Criteria andAcceptedIsNotNull() {
            addCriterion("accepted is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptedEqualTo(Integer value) {
            addCriterion("accepted =", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotEqualTo(Integer value) {
            addCriterion("accepted <>", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedGreaterThan(Integer value) {
            addCriterion("accepted >", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedGreaterThanOrEqualTo(Integer value) {
            addCriterion("accepted >=", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedLessThan(Integer value) {
            addCriterion("accepted <", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedLessThanOrEqualTo(Integer value) {
            addCriterion("accepted <=", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedIn(List<Integer> values) {
            addCriterion("accepted in", values, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotIn(List<Integer> values) {
            addCriterion("accepted not in", values, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedBetween(Integer value1, Integer value2) {
            addCriterion("accepted between", value1, value2, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotBetween(Integer value1, Integer value2) {
            addCriterion("accepted not between", value1, value2, "accepted");
            return (Criteria) this;
        }

        public Criteria andSubmitIsNull() {
            addCriterion("submit is null");
            return (Criteria) this;
        }

        public Criteria andSubmitIsNotNull() {
            addCriterion("submit is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitEqualTo(Integer value) {
            addCriterion("submit =", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotEqualTo(Integer value) {
            addCriterion("submit <>", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitGreaterThan(Integer value) {
            addCriterion("submit >", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit >=", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitLessThan(Integer value) {
            addCriterion("submit <", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitLessThanOrEqualTo(Integer value) {
            addCriterion("submit <=", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitIn(List<Integer> values) {
            addCriterion("submit in", values, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotIn(List<Integer> values) {
            addCriterion("submit not in", values, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitBetween(Integer value1, Integer value2) {
            addCriterion("submit between", value1, value2, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotBetween(Integer value1, Integer value2) {
            addCriterion("submit not between", value1, value2, "submit");
            return (Criteria) this;
        }

        public Criteria andSolvedIsNull() {
            addCriterion("solved is null");
            return (Criteria) this;
        }

        public Criteria andSolvedIsNotNull() {
            addCriterion("solved is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedEqualTo(Integer value) {
            addCriterion("solved =", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotEqualTo(Integer value) {
            addCriterion("solved <>", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedGreaterThan(Integer value) {
            addCriterion("solved >", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedGreaterThanOrEqualTo(Integer value) {
            addCriterion("solved >=", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedLessThan(Integer value) {
            addCriterion("solved <", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedLessThanOrEqualTo(Integer value) {
            addCriterion("solved <=", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedIn(List<Integer> values) {
            addCriterion("solved in", values, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotIn(List<Integer> values) {
            addCriterion("solved not in", values, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedBetween(Integer value1, Integer value2) {
            addCriterion("solved between", value1, value2, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotBetween(Integer value1, Integer value2) {
            addCriterion("solved not between", value1, value2, "solved");
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