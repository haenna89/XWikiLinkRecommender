/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package de.csw.linkgenerator.plugin.lucene.textextraction;

import java.io.ByteArrayInputStream;

import org.apache.poi.hslf.extractor.PowerPointExtractor;

import de.csw.linkgenerator.plugin.lucene.textextraction.MimetypeTextExtractor;

/**
 * Text extractor for Microsoft Power Point files.
 */
public class MSPowerPointTextExtractor implements MimetypeTextExtractor
{
    public String getText(byte[] data) throws Exception
    {
        PowerPointExtractor ppe = new PowerPointExtractor(new ByteArrayInputStream(data));
        return ppe.getText(true, true);
    }
}
