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
package com.itextpdf.html2pdf.css.grid;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.ExtendedHtmlConversionITextTest;
import com.itextpdf.layout.logs.LayoutLogMessageConstant;
import com.itextpdf.test.LogLevelConstants;
import com.itextpdf.test.annotations.LogMessage;
import com.itextpdf.test.annotations.LogMessages;

import java.io.IOException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("IntegrationTest")
public class GridTemplatesTest extends ExtendedHtmlConversionITextTest {
    public static final String SOURCE_FOLDER = "./src/test/resources/com/itextpdf/html2pdf/css/grid/GridTemplatesTest/";
    public static final String DESTINATION_FOLDER = "./target/test/com/itextpdf/html2pdf/css/grid/GridTemplatesTest/";

    @BeforeAll
    public static void beforeClass() {
        createOrClearDestinationFolder(DESTINATION_FOLDER);
    }

    @Test
    public void basicColumnOneDivTest() throws IOException, InterruptedException {
        runTest("basicColumnOneDivTest");
    }

    @Test
    public void basicColumnFewDivsTest() throws IOException, InterruptedException {
        runTest("basicColumnFewDivsTest");
    }

    @Test
    public void basicColumnFewDivsWithFrTest() throws IOException, InterruptedException {
        runTest("basicColumnFewDivsWithFrTest");
    }

    @Test
    public void basicColumnFewDivs2Test() throws IOException, InterruptedException {
        runTest("basicColumnFewDivs2Test");
    }

    @Test
    // TODO DEVSIX-8330
    // TODO DEVSIX-8331
    public void basicColumnMultiPageTest() throws IOException, InterruptedException {
        runTest("basicColumnMultiPageTest");
    }

    @Test
    public void basicColumnStartEndTest() throws IOException, InterruptedException {
        runTest("basicColumnStartEndTest");
    }

    @Test
    public void basicColumnStartEnd2Test() throws IOException, InterruptedException {
        runTest("basicColumnStartEnd2Test");
    }

    @Test
    // We need to add a "dry run" for cell balancing without layouting to determine final grid size
    public void basicColumnStartEnd3Test() throws IOException, InterruptedException {
        runTest("basicColumnStartEnd3Test");
    }

    //--------------- without grid-templates-columns and grid-templates-rows ---------------
    @Test
    public void basicOnlyGridDisplayTest() throws IOException, InterruptedException {
        runTest("basicOnlyGridDisplayTest");
    }

    //--------------- grid-templates-rows ---------------
    @Test
    public void basicRowOneDivTest() throws IOException, InterruptedException {
        runTest("basicRowOneDivTest");
    }

    @Test
    public void basicRowFewDivsTest() throws IOException, InterruptedException {
        runTest("basicRowFewDivsTest");
    }

    @Test
    public void basicRowStartEndTest() throws IOException, InterruptedException {
        runTest("basicRowStartEndTest");
    }

    //--------------- grid-templates-columns + grid-templates-rows ---------------

    @Test
    public void basicColumnRowFewDivs1Test() throws IOException, InterruptedException {
        runTest("basicColumnRowFewDivs1Test");
    }

    @Test
    public void basicColumnRowFewDivs2Test() throws IOException, InterruptedException {
        runTest("basicColumnRowFewDivs2Test");
    }

    @Test
    public void basicColumnRowFewDivs3Test() throws IOException, InterruptedException {
        runTest("basicColumnRowFewDivs3Test");
    }

    @Test
    public void basicColumnRowFewDivs4Test() throws IOException, InterruptedException {
        runTest("basicColumnRowFewDivs4Test");
    }

    @Test
    public void basicColumnRowStartEndTest() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEndTest");
    }

    @Test
    public void basicColumnRowStartEnd2Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd2Test");
    }

    @Test
    public void basicColumnRowStartEnd3Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd3Test");
    }

    @Test
    public void basicColumnRowStartEnd4Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd4Test");
    }

    @Test
    public void basicColumnRowStartEnd5Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd5Test");
    }

    //TODO DEVSIX-8325 null rows/cols not terminated, causes error in layout
    @Test
    public void basicColumnRowStartEnd6Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd6Test");
    }

    @Test
    public void basicColumnRowStartEnd7Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd7Test");
    }

    @Test
    public void basicColumnRowStartEnd8Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd8Test");
    }

    @Test
    public void basicColumnRowStartEnd9Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd9Test");
    }

    @Test
    public void basicColumnRowStartEnd10Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd10Test");
    }

    @Test
    public void basicColumnRowStartEnd11Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd11Test");
    }
    @Test
    public void basicColumnRowStartEnd12Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd12Test");
    }
    @Test
    public void basicColumnRowStartEnd13Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd13Test");
    }
    @Test
    public void basicColumnRowStartEnd14Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd14Test");
    }
    @Test
    public void basicColumnRowStartEnd15Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd15Test");
    }
    @Test
    public void basicColumnRowStartEnd16Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd16Test");
    }
    @Test
    public void basicColumnRowStartEnd17Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd17Test");
    }

    @Test
    public void basicColumnRowStartEnd18Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd18Test");
    }

    @Test
    public void basicColumnRowStartEnd19Test() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEnd19Test");
    }

    @Test
    public void basicColumnRowStartEndWithInlineTextTest() throws IOException, InterruptedException {
        runTest("basicColumnRowStartEndWithInlineTextTest");
    }

    @Test
    public void basicGridAfterParagraphTest() throws IOException, InterruptedException {
        runTest("basicGridAfterParagraphTest");
    }

    @Test
    public void basicRowFlowTest() throws IOException, InterruptedException {
        runTest("basicRowFlowTest");
    }

    @Test
    public void basicRowDenseFlowTest() throws IOException, InterruptedException {
        runTest("basicRowDenseFlowTest");
    }

    @Test
    public void basicColumnFlowTest() throws IOException, InterruptedException {
        runTest("basicColumnFlowTest");
    }

    @Test
    public void basicColumnDenseFlowTest() throws IOException, InterruptedException {
        runTest("basicColumnDenseFlowTest");
    }

    @Test
    public void fixedTemplatesAndCellDoesNotHaveDirectNeighborTest() throws IOException, InterruptedException {
        runTest("fixedTemplatesAndCellDoesNotHaveDirectNeighborTest");
    }

    @Test
    public void gridInsideGridTest() throws IOException, InterruptedException {
        runTest("gridInsideGridTest");
    }

    @Test
    public void gridInsideGridOnPageBreakTest() throws IOException, InterruptedException {
        runTest("gridInsideGridOnPageBreakTest");
    }

    @Test
    public void elementDoesntFitContentTest() throws IOException, InterruptedException {
        runTest("elementDoesntFitContentTest");
    }

    @Test
    public void elementDoesntFitTest() throws IOException, InterruptedException {
        runTest("elementDoesntFitTest");
    }

    @Test
    public void elementDoesntFitHorizontallyTest() throws IOException, InterruptedException {
        runTest("elementDoesntFitHorizontallyTest");
    }

    @Test
    public void elementDoesntFitOverflowingToNextPageTest() throws IOException, InterruptedException {
        runTest("elementDoesntFitOverflowingToNextPageTest");
    }

    @Test
    public void elementDoesntFitContentOverflowingToNextPageTest() throws IOException, InterruptedException {
        runTest("elementDoesntFitContentOverflowingToNextPageTest");
    }

    @Test
    public void textsWithOverflowTest() throws IOException, InterruptedException {
        runTest("textsWithOverflowTest");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LayoutLogMessageConstant.ELEMENT_DOES_NOT_FIT_AREA, logLevel =
                    LogLevelConstants.WARN)})
    public void imageElementDoesntFitTest() throws IOException, InterruptedException {
        runTest("imageElementDoesntFitTest");
    }

    @Test
    public void manyImageElementsTest() throws IOException, InterruptedException {
        runTest("manyImageElementsTest");
    }

    @Test
    public void imageElementsOn2ndPageTest() throws IOException, InterruptedException {
        runTest("imageElementsOn2ndPageTest");
    }

    @Test
    public void gridWithBrTest() throws IOException, InterruptedException {
        runTest("gridWithBrTest");
    }

    @Test
    public void gridWithPageBreakTest() throws IOException, InterruptedException {
        runTest("gridWithPageBreakTest");
    }

    @Test
    public void gridWithTableTest() throws IOException, InterruptedException {
        runTest("gridWithTableTest");
    }

    @Test
    public void columnFlowOnSplitTest() throws IOException, InterruptedException {
        runTest("columnFlowOnSplitTest");
    }

    @Test
    public void basicGridRemValuesTest() throws IOException, InterruptedException {
        runTest("grid-layout-rem");
    }

    @Test
    public void basicGridEmValuesTest() throws IOException, InterruptedException {
        runTest("grid-layout-em");
    }

    @Test
    public void gridLayoutDisablingTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("basicColumnFewDivsTest",
                SOURCE_FOLDER, DESTINATION_FOLDER, false,
                new ConverterProperties().setBaseUri(SOURCE_FOLDER).setCssGridEnabled(true));
        convertToPdfAndCompare("basicColumnFewDivsWithDisabledGridLayoutTest",
                SOURCE_FOLDER, DESTINATION_FOLDER, false,
                new ConverterProperties().setBaseUri(SOURCE_FOLDER));
    }

    private void runTest(String testName) throws IOException, InterruptedException {
        convertToPdfAndCompare(testName,
                SOURCE_FOLDER, DESTINATION_FOLDER, false,
                new ConverterProperties().setBaseUri(SOURCE_FOLDER).setCssGridEnabled(true));
    }
}
