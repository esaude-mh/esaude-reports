/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.esaudereports.reporting.cohort.evaluator;

import org.openmrs.Cohort;
import org.openmrs.annotation.Handler;
import org.openmrs.module.esaudereports.reporting.cohort.definition.DateObsValueBetweenCohortDefinition;
import org.openmrs.module.reporting.cohort.EvaluatedCohort;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.evaluator.CohortDefinitionEvaluator;
import org.openmrs.module.reporting.evaluation.EvaluationContext;

/**
 * Created by Nicholas Ingosi on 6/23/17. Evaluates a DateObsValueBetweenCohortDefinition and
 * produces a Cohort
 */
@Handler(supports = { DateObsValueBetweenCohortDefinition.class })
public class DateObsValueBetweenCohortDefinitionEvaluator implements CohortDefinitionEvaluator {
	
	/**
	 * @see CohortDefinitionEvaluator#evaluate(org.openmrs.module.reporting.cohort.definition.CohortDefinition,
	 *      org.openmrs.module.reporting.evaluation.EvaluationContext)
	 * @should test any with many properties specified
	 * @should find nobody if no patients match
	 */
	public EvaluatedCohort evaluate(CohortDefinition cohortDefinition, EvaluationContext context) {
		DateObsValueBetweenCohortDefinition cd = (DateObsValueBetweenCohortDefinition) cohortDefinition;
		
		Cohort c = new Cohort();
		
		return new EvaluatedCohort(c, cohortDefinition, context);
	}
}
