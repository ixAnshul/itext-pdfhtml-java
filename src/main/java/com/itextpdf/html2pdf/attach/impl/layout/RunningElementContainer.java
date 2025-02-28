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
package com.itextpdf.html2pdf.attach.impl.layout;

import com.itextpdf.html2pdf.attach.ITagWorker;
import com.itextpdf.styledxmlparser.node.IElementNode;

/**
 * A wrapper for the running elements taken out of the normal flow.
 */
public class RunningElementContainer {
    private IElementNode runningElement;
    private ITagWorker processedElementWorker;
    private int pageNum;
    private boolean firstOnPage;

    /**
     * Initializes a new instance of {@link RunningElementContainer} that contains
     * given running element {@link IElementNode} and {@link ITagWorker} instances.
     * @param runningElement the {@link IElementNode} of the running element.
     * @param processedElementWorker the {@link ITagWorker} that was created for the running element
     *                               and have been already completely processed (with all running element children).
     */
    public RunningElementContainer(IElementNode runningElement, ITagWorker processedElementWorker) {
        this.runningElement = runningElement;
        this.processedElementWorker = processedElementWorker;
    }

    /**
     * Sets the page on which underlying running element was to be placed.
     * @param pageNum the 1-based index of the page on which running element was to be placed.
     * @param firstOnPage specifies if the given running element would have placed as the first element on the page or not.
     */
    public void setOccurrencePage(int pageNum, boolean firstOnPage) {
        this.pageNum = pageNum;
        this.firstOnPage = firstOnPage;
    }

    /**
     * Gets the page on which underlying running element was to be placed.
     * @return the 1-based index of the page or 0 if element page is not yet defined.
     */
    public int getOccurrencePage() {
        return this.pageNum;
    }

    /**
     * Specifies if the given running element would have placed as the first element on the page or not.
     * Returned value only makes sense if {@link #getOccurrencePage()} returns value greater than 0.
     * @return true if it would be the first element on the page, otherwise false.
     */
    public boolean isFirstOnPage() {
        return this.firstOnPage;
    }

    IElementNode getRunningElement() {
        return runningElement;
    }

    ITagWorker getProcessedElementWorker() {
        return processedElementWorker;
    }
}
