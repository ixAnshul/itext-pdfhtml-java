/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2024 Apryse Group NV
    Authors: Apryse Software.

    This program is offered under a commercial and under the AGPL license.
    For commercial licensing, contact us at https://itextpdf.com/sales.  For AGPL licensing, see below.

    AGPL licensing:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.itextpdf.html2pdf.attach.impl;

import com.itextpdf.commons.actions.NamespaceConstant;
import com.itextpdf.commons.actions.contexts.IMetaInfo;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.ProcessorContextCreator;
import com.itextpdf.html2pdf.attach.ProcessorContext;
import com.itextpdf.test.ExtendedITextTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

@Tag("UnitTest")
public class HtmlMetaInfoContainerTest extends ExtendedITextTest {

    @Test
    public void createAndGetMetaInfoTest() {
        TestMetaInfo metaInfo = new TestMetaInfo();
        HtmlMetaInfoContainer metaInfoContainer = new HtmlMetaInfoContainer(metaInfo);

        Assertions.assertSame(metaInfo, metaInfoContainer.getMetaInfo());
    }

    @Test
    public void getNullMetaInfoTest() {
        HtmlMetaInfoContainer metaInfoContainer = new HtmlMetaInfoContainer(null);

        Assertions.assertNull(metaInfoContainer.getMetaInfo());
    }

    @Test
    public void processorContextCreatorCreatesContextWithHtmlMetaInfoTest() {
        ProcessorContext processorContext = ProcessorContextCreator.createProcessorContext(new ConverterProperties());

        HtmlMetaInfoContainer htmlMetaInfoContainer = processorContext.getMetaInfoContainer();
        Assertions.assertNotNull(htmlMetaInfoContainer);

        IMetaInfo metaInfo = htmlMetaInfoContainer.getMetaInfo();
        Assertions.assertTrue(metaInfo.getClass().getName().startsWith(NamespaceConstant.PDF_HTML + "."));
    }

    private static class TestMetaInfo implements IMetaInfo {
    }
}
