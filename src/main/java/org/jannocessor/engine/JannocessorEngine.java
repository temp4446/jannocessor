/**
 * Copyright 2011 jannocessor.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jannocessor.engine;

import java.util.Map;

import org.jannocessor.service.api.ConfiguratÓr;
import org.jannocessor.service.api.JannocessorException;
import org.jannocessor.service.api.PathLocator;
import org.jannocessor.service.api.RuleExecutor;
import org.jannocessor.service.api.RulesGenerator;
import org.jannocessor.service.api.TemplateRenderer;

public interface JannocessorEngine extends PathLocator, ConfiguratÓr,
		RuleExecutor, TemplateRenderer, RulesGenerator {

	void setInputOptions(Map<String, String> options)
			throws JannocessorException;

}
