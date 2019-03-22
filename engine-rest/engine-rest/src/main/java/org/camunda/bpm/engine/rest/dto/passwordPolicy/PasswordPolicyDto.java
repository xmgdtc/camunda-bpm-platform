/*
 * Copyright © 2013-2019 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.rest.dto.passwordPolicy;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.engine.pwpolicy.PasswordPolicyRule;

/**
 * @author Miklas Boskamp
 */
public class PasswordPolicyDto {
  private List<PasswordPolicyRuleDto> rules = new ArrayList<PasswordPolicyRuleDto>();

  // transformers

  public static PasswordPolicyDto fromPasswordPolicyRules(List<PasswordPolicyRule> rules) {
    PasswordPolicyDto poilicy = new PasswordPolicyDto();

    for (PasswordPolicyRule rule : rules) {
      poilicy.rules.add(PasswordPolicyRuleDto.fromRule(rule));
    }
    return poilicy;
  }

  // getters / setters

  public List<PasswordPolicyRuleDto> getRules() {
    return rules;
  }

  public void setRules(List<PasswordPolicyRuleDto> rules) {
    this.rules = rules;
  }
}