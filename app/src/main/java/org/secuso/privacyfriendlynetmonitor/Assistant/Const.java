/*
    TLSMetric
    - Copyright (2015, 2016) Felix Tsala Schiller

    ###################################################################

    This file is part of TLSMetric.

    TLSMetric is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    TLSMetric is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TLSMetric.  If not, see <http://www.gnu.org/licenses/>.

    Diese Datei ist Teil von TLSMetric.

    TLSMetric ist Freie Software: Sie können es unter den Bedingungen
    der GNU General Public License, wie von der Free Software Foundation,
    Version 3 der Lizenz oder (nach Ihrer Wahl) jeder späteren
    veröffentlichten Version, weiterverbreiten und/oder modifizieren.

    TLSMetric wird in der Hoffnung, dass es nützlich sein wird, aber
    OHNE JEDE GEWÄHRLEISTUNG, bereitgestellt; sogar ohne die implizite
    Gewährleistung der MARKTFÄHIGKEIT oder EIGNUNG FÜR EINEN BESTIMMTEN ZWECK.
    Siehe die GNU General Public License für weitere Details.

    Sie sollten eine Kopie der GNU General Public License zusammen mit diesem
    Programm erhalten haben. Wenn nicht, siehe <http://www.gnu.org/licenses/>.
 */

package org.secuso.privacyfriendlynetmonitor.Assistant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Storing constant values
 */

public interface Const {

    //App constants
    boolean IS_DEBUG = false;
    String LOG_TAG = "TLSMetric";
    String FILE_IF_LIST = "iflist";

    //Detector constants
    int REPORT_TTL_DEFAULT = 15000;
    Integer[] TLS_PORT_VALUES = new Integer[] { 993, 443, 995, 995, 614, 465, 587, 22 };
    Set<Integer> TLS_PORTS = new HashSet<>(Arrays.asList(TLS_PORT_VALUES));
    Integer[] UNSECURE_PORT_VALUES = new Integer[] { 21, 23, 25, 80, 109, 110, 143, 137, 138 ,139,
            161, 992 };
    Set<Integer> UNSECURE_PORTS = new HashSet<>(Arrays.asList(UNSECURE_PORT_VALUES));

    //String Builder Constants
    String STATUS_TLS = "Encrypted";
    String STATUS_UNSECURE = "Unencrypted";
    String STATUS_UNKNOWN = "";

    //SharedPrefs identifiers
    String REPORT_TTL = "REPORT_TTL";
    String DETAIL_MODE = "DETAIL_MODE";
    String IS_FIRST_START = "IS_FIRST_START";
    String IS_LOG = "IS_LOG";
    String IS_CERTVAL = "IS_CERTVAL";


}