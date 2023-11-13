/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.xalan.xslt3;

import org.apache.xalan.xpath3.FnAbsTests;
import org.apache.xalan.xpath3.FnDataTests;
import org.apache.xalan.xpath3.FnDocTests;
import org.apache.xalan.xpath3.FnForEachTests;
import org.apache.xalan.xpath3.InlineFunctionItemExprTests;
import org.apache.xalan.xpath3.StringTests;
import org.apache.xalan.xpath3.ValueComparisonTests;
import org.apache.xalan.xpath3.XsConstructorFunctionTests;
import org.apache.xalan.xpath3.XsDateTimeArithmeticTests;
import org.apache.xalan.xpath3.XsDateTimeTests;
import org.apache.xalan.xpath3.XsTimeWithArithmeticTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * A JUnit 4 test suite, for XSLT 3.0 and XPath 3.1 tests.
 * 
 * @author Mukul Gandhi <mukulg@apache.org>
 * 
 * @xsl.usage advanced
 */
@RunWith(Suite.class)
@SuiteClasses({ FnDocTests.class, FnDataTests.class, RecursiveFunctionTests.class,
                XslFunctionTests.class, HigherOrderFunctionTests.class, XsDateTimeTests.class,
                ValueComparisonTests.class, InlineFunctionItemExprTests.class, 
                FnForEachTests.class, XsConstructorFunctionTests.class,
                FnAbsTests.class, StringTests.class, XsDateTimeArithmeticTests.class,
                XsTimeWithArithmeticTests.class })
public class Xsl3TestSuite1 {

}