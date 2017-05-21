/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.codec.protobuf.codec;

import java.lang.reflect.Type;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.dataformat.protobuf.schema.ProtobufSchema;

public class TestAbstractCodec extends AbstractCodec {

    private AbstractCodec abstractCodecTest = null;

    @Before
    public void setUp() throws Exception {
        abstractCodecTest = new TestAbstractCodec();
    }

    @After
    public void tearDown() throws Exception {
        abstractCodecTest = null;
    }

    @Test
    public void testGetWriter() {
        Assert.assertNull(abstractCodecTest.getWriter());
    }

    @Test
    public void testGetReader() {
        Assert.assertNull(abstractCodecTest.getReader());
    }

    @Override
    public void init(ProtobufSchema schema, Type... types) {
        /* Do not worry, overridden method*/
    }

}