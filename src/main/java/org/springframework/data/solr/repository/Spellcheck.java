/*
 * Copyright 2016 the original author or authors.
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
package org.springframework.data.solr.repository;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.data.solr.core.query.result.SpellcheckedPage;

/**
 * Enable Solr spellcheck component for a repository query method.<br />
 * Use {@link SpellcheckedPage} as method return to access suggestions.
 * 
 * @author Christoph Strobl
 * @since 2.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Spellcheck {

	long count() default -1;

	String dictionary() default "";

	long maxResultsForSuggest() default -1;

	long alternativeTermCount() default -1;

	float accuracy() default -1F;

	boolean onlyMorePopular() default false;

	boolean buildDictionary() default false;

	boolean collate() default false;

	long maxCollations() default -1;

	long maxCollationsTries() default -1;

	long maxCollationEvaluations() default -1;

	boolean collateExtendedResults() default false;

}
