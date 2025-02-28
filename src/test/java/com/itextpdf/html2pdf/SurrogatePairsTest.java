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
package com.itextpdf.html2pdf;

import com.itextpdf.io.logs.IoLogMessageConstant;
import com.itextpdf.kernel.utils.CompareTool;
import com.itextpdf.test.ExtendedITextTest;
import com.itextpdf.test.annotations.LogMessage;
import com.itextpdf.test.annotations.LogMessages;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import java.io.File;
import java.io.IOException;

@Tag("IntegrationTest")
public class SurrogatePairsTest extends ExtendedITextTest {
    public static final String sourceFolder = "./src/test/resources/com/itextpdf/html2pdf/SurrogatePairsTests/";
    public static final String destinationFolder = "./target/test/com/itextpdf/html2pdf/SurrogatePairsTests/";

    @BeforeAll
    public static void beforeClass() {
        createOrClearDestinationFolder(destinationFolder);
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = IoLogMessageConstant.TYPOGRAPHY_NOT_FOUND, count = 2)})
    public void surrogatePairFrom2Chars() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "surrogatePairFrom2Chars.html"),
                new File(destinationFolder + "surrogatePairFrom2Chars.pdf"));
        Assertions.assertNull(new CompareTool().compareByContent(destinationFolder + "surrogatePairFrom2Chars.pdf",
                sourceFolder + "cmp_surrogatePairFrom2Chars.pdf", destinationFolder));
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = IoLogMessageConstant.TYPOGRAPHY_NOT_FOUND, count = 2)})
    public void surrogatePair2Pairs() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "surrogatePair2Pairs.html"),
                new File(destinationFolder + "surrogatePair2Pairs.pdf"));
        Assertions.assertNull(new CompareTool().compareByContent(destinationFolder + "surrogatePair2Pairs.pdf",
                sourceFolder + "cmp_surrogatePair2Pairs.pdf", destinationFolder));
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = IoLogMessageConstant.TYPOGRAPHY_NOT_FOUND, count = 2)})
    public void surrogatePairFullCharacter() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "surrogatePairFullCharacter.html"),
                new File(destinationFolder + "surrogatePairFullCharacter.pdf"));
        Assertions.assertNull(new CompareTool().compareByContent(destinationFolder + "surrogatePairFullCharacter.pdf",
                sourceFolder + "cmp_surrogatePairFullCharacter.pdf", destinationFolder));
    }

    @Test
    //TODO DEVSIX-3307: It is required to update cmp files when the ticket will be implemented.
    @LogMessages(messages = {
            @LogMessage(messageTemplate = IoLogMessageConstant.TYPOGRAPHY_NOT_FOUND, count = 2),
            @LogMessage(messageTemplate = IoLogMessageConstant.FONT_SUBSET_ISSUE)})
    public void surrogatePairCombingFullSurrs() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "surrogatePairCombingFullSurrs.html"),
                new File(destinationFolder + "surrogatePairCombingFullSurrs.pdf"));
        Assertions.assertNull(new CompareTool().compareByContent(destinationFolder + "surrogatePairCombingFullSurrs.pdf",
                sourceFolder + "cmp_surrogatePairCombingFullSurrs.pdf", destinationFolder));
    }

    @Test
    //TODO DEVSIX-3307: It is required to update cmp files when the ticket will be implemented.
    @LogMessages(messages = {
            @LogMessage(messageTemplate = IoLogMessageConstant.TYPOGRAPHY_NOT_FOUND, count = 2),
            @LogMessage(messageTemplate = IoLogMessageConstant.FONT_SUBSET_ISSUE)})
    public void surrogatePairCombingFullSurrsWithNoSurrs() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "surrogatePairCombingFullSurrsWithNoSurrs.html"),
                new File(destinationFolder + "surrogatePairCombingFullSurrsWithNoSurrs.pdf"));
        Assertions.assertNull(new CompareTool().compareByContent(destinationFolder + "surrogatePairCombingFullSurrsWithNoSurrs.pdf",
                sourceFolder + "cmp_surrogatePairCombingFullSurrsWithNoSurrs.pdf", destinationFolder));
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = IoLogMessageConstant.TYPOGRAPHY_NOT_FOUND, count = 2)})
    public void surrogatePairCombinationOf3TypesPairs() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "surrogatePairCombinationOf3TypesPairs.html"),
                new File(destinationFolder + "surrogatePairCombinationOf3TypesPairs.pdf"));
        Assertions.assertNull(new CompareTool().compareByContent(destinationFolder + "surrogatePairCombinationOf3TypesPairs.pdf",
                sourceFolder + "cmp_surrogatePairCombinationOf3TypesPairs.pdf", destinationFolder));
    }
}
