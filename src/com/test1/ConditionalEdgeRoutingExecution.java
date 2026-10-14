package com.test1;

public class ConditionalEdgeRoutingExecution {
	private long routingExecutionId;
	private long conditionalEdgeRoutingId;
	private long workflowExecutionId;
	private String threadId;
	private String checkpointId;
	private String sourceNodeId;
	private String currentGraphState;
	private String evaluatedStateKey;
	private String evaluatedStateValue;
	private String conditionExpression;
	private String conditionEvaluationResult;
	private String selectedTargetNode;
	private String alternativeTargetNodes;
	private String routingDecision;
	private String routingReason;
	private String routingStartTime;
	private String routingEndTime;
	private long routingExecutionDuration;

	public ConditionalEdgeRoutingExecution() {

	}

	public ConditionalEdgeRoutingExecution(long routingExecutionId, long conditionalEdgeRoutingId,
			long workflowExecutionId, String threadId, String checkpointId, String sourceNodeId,
			String currentGraphState, String evaluatedStateKey, String evaluatedStateValue, String conditionExpression,
			String conditionEvaluationResult, String selectedTargetNode, String alternativeTargetNodes,
			String routingDecision, String routingReason, String routingStartTime, String routingEndTime,
			long routingExecutionDuration) {
		super();
		this.routingExecutionId = routingExecutionId;
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
		this.workflowExecutionId = workflowExecutionId;
		this.threadId = threadId;
		this.checkpointId = checkpointId;
		this.sourceNodeId = sourceNodeId;
		this.currentGraphState = currentGraphState;
		this.evaluatedStateKey = evaluatedStateKey;
		this.evaluatedStateValue = evaluatedStateValue;
		this.conditionExpression = conditionExpression;
		this.conditionEvaluationResult = conditionEvaluationResult;
		this.selectedTargetNode = selectedTargetNode;
		this.alternativeTargetNodes = alternativeTargetNodes;
		this.routingDecision = routingDecision;
		this.routingReason = routingReason;
		this.routingStartTime = routingStartTime;
		this.routingEndTime = routingEndTime;
		this.routingExecutionDuration = routingExecutionDuration;
	}

	public long getRoutingExecutionId() {
		return routingExecutionId;
	}

	public void setRoutingExecutionId(long routingExecutionId) {
		this.routingExecutionId = routingExecutionId;
	}

	public long getConditionalEdgeRoutingId() {
		return conditionalEdgeRoutingId;
	}

	public void setConditionalEdgeRoutingId(long conditionalEdgeRoutingId) {
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
	}

	public long getWorkflowExecutionId() {
		return workflowExecutionId;
	}

	public void setWorkflowExecutionId(long workflowExecutionId) {
		this.workflowExecutionId = workflowExecutionId;
	}

	public String getThreadId() {
		return threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}

	public String getCheckpointId() {
		return checkpointId;
	}

	public void setCheckpointId(String checkpointId) {
		this.checkpointId = checkpointId;
	}

	public String getSourceNodeId() {
		return sourceNodeId;
	}

	public void setSourceNodeId(String sourceNodeId) {
		this.sourceNodeId = sourceNodeId;
	}

	public String getCurrentGraphState() {
		return currentGraphState;
	}

	public void setCurrentGraphState(String currentGraphState) {
		this.currentGraphState = currentGraphState;
	}

	public String getEvaluatedStateKey() {
		return evaluatedStateKey;
	}

	public void setEvaluatedStateKey(String evaluatedStateKey) {
		this.evaluatedStateKey = evaluatedStateKey;
	}

	public String getEvaluatedStateValue() {
		return evaluatedStateValue;
	}

	public void setEvaluatedStateValue(String evaluatedStateValue) {
		this.evaluatedStateValue = evaluatedStateValue;
	}

	public String getConditionExpression() {
		return conditionExpression;
	}

	public void setConditionExpression(String conditionExpression) {
		this.conditionExpression = conditionExpression;
	}

	public String getConditionEvaluationResult() {
		return conditionEvaluationResult;
	}

	public void setConditionEvaluationResult(String conditionEvaluationResult) {
		this.conditionEvaluationResult = conditionEvaluationResult;
	}

	public String getSelectedTargetNode() {
		return selectedTargetNode;
	}

	public void setSelectedTargetNode(String selectedTargetNode) {
		this.selectedTargetNode = selectedTargetNode;
	}

	public String getAlternativeTargetNodes() {
		return alternativeTargetNodes;
	}

	public void setAlternativeTargetNodes(String alternativeTargetNodes) {
		this.alternativeTargetNodes = alternativeTargetNodes;
	}

	public String getRoutingDecision() {
		return routingDecision;
	}

	public void setRoutingDecision(String routingDecision) {
		this.routingDecision = routingDecision;
	}

	public String getRoutingReason() {
		return routingReason;
	}

	public void setRoutingReason(String routingReason) {
		this.routingReason = routingReason;
	}

	public String getRoutingStartTime() {
		return routingStartTime;
	}

	public void setRoutingStartTime(String routingStartTime) {
		this.routingStartTime = routingStartTime;
	}

	public String getRoutingEndTime() {
		return routingEndTime;
	}

	public void setRoutingEndTime(String routingEndTime) {
		this.routingEndTime = routingEndTime;
	}

	public long getRoutingExecutionDuration() {
		return routingExecutionDuration;
	}

	public void setRoutingExecutionDuration(long routingExecutionDuration) {
		this.routingExecutionDuration = routingExecutionDuration;
	}

}
