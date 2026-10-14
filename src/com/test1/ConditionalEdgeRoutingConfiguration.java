package com.test1;

public class ConditionalEdgeRoutingConfiguration {
	private long conditionalEdgeRoutingId;
	private long workflowDefinitionId;
	private long graphConfigurationId;
	private String sourceNodeId;
	private String sourceNodeName;
	private String routingFunctionName;
	private String routingStrategy;
	private String routingCondition;
	private String conditionExpression;
	private String stateEvaluationKey;
	private String stateEvaluationType;
	private String availableTargetNodes;
	private String defaultTargetNode;
	private String fallbackNodeId;
	private String priorityBasedRoutingEnabled;
	private String dynamicRoutingEnabled;
	private String parallelRoutingEnabled;
	private String routingValidationEnabled;

	public ConditionalEdgeRoutingConfiguration() {

	}

	public ConditionalEdgeRoutingConfiguration(long conditionalEdgeRoutingId, long workflowDefinitionId,
			long graphConfigurationId, String sourceNodeId, String sourceNodeName, String routingFunctionName,
			String routingStrategy, String routingCondition, String conditionExpression, String stateEvaluationKey,
			String stateEvaluationType, String availableTargetNodes, String defaultTargetNode, String fallbackNodeId,
			String priorityBasedRoutingEnabled, String dynamicRoutingEnabled, String parallelRoutingEnabled,
			String routingValidationEnabled) {
		super();
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
		this.workflowDefinitionId = workflowDefinitionId;
		this.graphConfigurationId = graphConfigurationId;
		this.sourceNodeId = sourceNodeId;
		this.sourceNodeName = sourceNodeName;
		this.routingFunctionName = routingFunctionName;
		this.routingStrategy = routingStrategy;
		this.routingCondition = routingCondition;
		this.conditionExpression = conditionExpression;
		this.stateEvaluationKey = stateEvaluationKey;
		this.stateEvaluationType = stateEvaluationType;
		this.availableTargetNodes = availableTargetNodes;
		this.defaultTargetNode = defaultTargetNode;
		this.fallbackNodeId = fallbackNodeId;
		this.priorityBasedRoutingEnabled = priorityBasedRoutingEnabled;
		this.dynamicRoutingEnabled = dynamicRoutingEnabled;
		this.parallelRoutingEnabled = parallelRoutingEnabled;
		this.routingValidationEnabled = routingValidationEnabled;
	}

	public long getConditionalEdgeRoutingId() {
		return conditionalEdgeRoutingId;
	}

	public void setConditionalEdgeRoutingId(long conditionalEdgeRoutingId) {
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
	}

	public long getWorkflowDefinitionId() {
		return workflowDefinitionId;
	}

	public void setWorkflowDefinitionId(long workflowDefinitionId) {
		this.workflowDefinitionId = workflowDefinitionId;
	}

	public long getGraphConfigurationId() {
		return graphConfigurationId;
	}

	public void setGraphConfigurationId(long graphConfigurationId) {
		this.graphConfigurationId = graphConfigurationId;
	}

	public String getSourceNodeId() {
		return sourceNodeId;
	}

	public void setSourceNodeId(String sourceNodeId) {
		this.sourceNodeId = sourceNodeId;
	}

	public String getSourceNodeName() {
		return sourceNodeName;
	}

	public void setSourceNodeName(String sourceNodeName) {
		this.sourceNodeName = sourceNodeName;
	}

	public String getRoutingFunctionName() {
		return routingFunctionName;
	}

	public void setRoutingFunctionName(String routingFunctionName) {
		this.routingFunctionName = routingFunctionName;
	}

	public String getRoutingStrategy() {
		return routingStrategy;
	}

	public void setRoutingStrategy(String routingStrategy) {
		this.routingStrategy = routingStrategy;
	}

	public String getRoutingCondition() {
		return routingCondition;
	}

	public void setRoutingCondition(String routingCondition) {
		this.routingCondition = routingCondition;
	}

	public String getConditionExpression() {
		return conditionExpression;
	}

	public void setConditionExpression(String conditionExpression) {
		this.conditionExpression = conditionExpression;
	}

	public String getStateEvaluationKey() {
		return stateEvaluationKey;
	}

	public void setStateEvaluationKey(String stateEvaluationKey) {
		this.stateEvaluationKey = stateEvaluationKey;
	}

	public String getStateEvaluationType() {
		return stateEvaluationType;
	}

	public void setStateEvaluationType(String stateEvaluationType) {
		this.stateEvaluationType = stateEvaluationType;
	}

	public String getAvailableTargetNodes() {
		return availableTargetNodes;
	}

	public void setAvailableTargetNodes(String availableTargetNodes) {
		this.availableTargetNodes = availableTargetNodes;
	}

	public String getDefaultTargetNode() {
		return defaultTargetNode;
	}

	public void setDefaultTargetNode(String defaultTargetNode) {
		this.defaultTargetNode = defaultTargetNode;
	}

	public String getFallbackNodeId() {
		return fallbackNodeId;
	}

	public void setFallbackNodeId(String fallbackNodeId) {
		this.fallbackNodeId = fallbackNodeId;
	}

	public String getPriorityBasedRoutingEnabled() {
		return priorityBasedRoutingEnabled;
	}

	public void setPriorityBasedRoutingEnabled(String priorityBasedRoutingEnabled) {
		this.priorityBasedRoutingEnabled = priorityBasedRoutingEnabled;
	}

	public String getDynamicRoutingEnabled() {
		return dynamicRoutingEnabled;
	}

	public void setDynamicRoutingEnabled(String dynamicRoutingEnabled) {
		this.dynamicRoutingEnabled = dynamicRoutingEnabled;
	}

	public String getParallelRoutingEnabled() {
		return parallelRoutingEnabled;
	}

	public void setParallelRoutingEnabled(String parallelRoutingEnabled) {
		this.parallelRoutingEnabled = parallelRoutingEnabled;
	}

	public String getRoutingValidationEnabled() {
		return routingValidationEnabled;
	}

	public void setRoutingValidationEnabled(String routingValidationEnabled) {
		this.routingValidationEnabled = routingValidationEnabled;
	}

}
