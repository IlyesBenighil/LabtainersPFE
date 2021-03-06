/*
This software was created by United States Government employees at 
The Center for Cybersecurity and Cyber Operations (C3O) 
at the Naval Postgraduate School NPS.  Please note that within the 
United States, copyright protection is not available for any works 
created  by United States Government employees, pursuant to Title 17 
United States Code Section 105.   This software is in the public 
domain and is not subject to copyright. 
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
  1. Redistributions of source code must retain the above copyright
     notice, this list of conditions and the following disclaimer.
  2. Redistributions in binary form must reproduce the above copyright
     notice, this list of conditions and the following disclaimer in the
     documentation and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT,
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 */
package labtainers.resultsui;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import labtainers.mainui.ToolTipHandlers.ToolTipWrapper;

/**
 *
 * @author Daniel Liao
 */
public class ParamReferenceStorage {
    public static ToolTipWrapper getWrapper(ToolTipWrapper[] tipList, String item){
        ToolTipWrapper retval = null;

        for(ToolTipWrapper tool_tip : tipList){
            if(tool_tip.getItem().equals(item)){
                retval = tool_tip;
                break;
            }
        }
        return retval;
    }   
    public static final ToolTipWrapper[] FieldType_ITEMS = new ToolTipWrapper[] {
        //0
        new ToolTipWrapper("TOKEN", "<html>Treat the line as space-delimited tokens.</html>"),
        // 1
        new ToolTipWrapper("PARENS", "<html>The desired value is contained in parenthesis.</html>"), 
        // 2
        new ToolTipWrapper("QUOTES", "<html>The desired value is contained in quotes.</html>"), 
        // 3
        new ToolTipWrapper("SLASH", "<html>The desired value is contained within slashes<br>" + 
                                    "e.g., /foo/</html>"), 
        // 4
        new ToolTipWrapper("LINE_COUNT", "<html>The quantity of lines in the file. Remaining fields<br>" + 
                                         "are ignored.</html>"), 
        // 5
        new ToolTipWrapper("CHECKSUM", "<html>The result value is set to the md5 checksum<br>" + 
                                       "of the file.</html>"), 
        // 6
        new ToolTipWrapper("CONTAINS", "<html>The result value is set to TRUE if the file<br>" + 
                                       "contains the string represented in field_id.</html>"), 
        // 7
        new ToolTipWrapper("FILE_REGEX", "<html>The result value is set to TRUE if the file<br>" + 
                                         "contains the regular expression represented in field_id.<br>" +
                                         "The python findall function is used on the entire file.<br>" +
                                         "See the acl lab for an example of multi-line expressions.</html>"), 
        // 8
        new ToolTipWrapper("STRING_COUNT", "<html>The result value is set to the quantity of<br>" + 
                                           "occurances of the string represented in field_id.</html>"),
        // 9
        new ToolTipWrapper("COMMAND_COUNT", "<html>Intended for use with bash_history files, counts<br>" + 
                                            "the occurances of the command given in the field_id.<br>"), 
        // 10    
        new ToolTipWrapper("PARAM", "<html>The result value is set to nth parameter<br>" +
                                    "(0 is the program name), provided in the<br>" +
                                    "program invocation.</html>"), 
        // 11        
        new ToolTipWrapper("SEARCH", "<html>The result is assigned the value of the search<br>" +
                                     "defined by the given field_id, which is treated as an<br>" +
                                     "expression having the syntax of pythons parse.search<br>" +
                                     "function. E.g., \"frame.number=={:d}\" would<br>" +
                                     "yield the frame number.</html>"),
        // 12        
        new ToolTipWrapper("GROUP", "<html>Intended for use with \"REGEX\" line types, the<br>" + 
                                    "result is set to the value of the regex group<br>" +
                                    "number named by the field_id. Regular expressions<br>" +
                                    "and their groups are processed using the python<br>" +
                                    "re.search semantics.</html>" ),
        // 13        
        new ToolTipWrapper("SIZE", "<html>The result value is set to the size of the file.</html>"), 
        // 14
        new ToolTipWrapper("TIME_DELIM", "" )};
    
    
    public static final ToolTipWrapper[] LineType_ITEMS = new ToolTipWrapper[] {
        // 0
        new ToolTipWrapper("NONE", ""), 
        // 1
        new ToolTipWrapper("LINE", "<html>The line_id is an integer line number<br>" +
                                   "(starting at one). Use of this to identify<br>" +
                                   "lines is discouraged since minor lab changes<br>" +
                                   "might alter the count.</html>"), 
        // 2
        new ToolTipWrapper("STARTSWITH", "<html>the line_id is a string. This names the<br>" +
                                         "first occurrence of a line that starts with<br>" +
                                         "this string.</html>" ), 
        // 3
        new ToolTipWrapper("HAVESTRING", "<html>The line_id is a string. This names the<br>" + 
                                         "first occurrence of a line that contains the<br>" +
                                         "string.</html>" ), 
        // 4
        new ToolTipWrapper("REGEX", "<html>The line_id is a regular expression. This names the<br>" + 
                                    "first occurrence of a line that matches the regular<br>" +
                                    "expression. Also see the \"GROUP\" field_type.</html>" ), 
        // 5
        new ToolTipWrapper("NEXT_STARTSWITH",  "<html>the line_id is a string. This names the<br>" + 
                                               "line preceeding the first occurrence of a line<br>" +
                                               "that starts with this string.</html>")};  
    

    public static final ToolTipWrapper[] TimestampType_ITEMS = new ToolTipWrapper[] {
        // 0
        new ToolTipWrapper("File", "<html>Result time stamps are derived <br>"+"from the file time stamp.</html>"),} ;
    
    
    //****These items may need to be stored differently for better organization)
    public static final ToolTipWrapper[] SpecialTimeStampType = new ToolTipWrapper[] {
      //FIELDTYPES
        // 0
        new ToolTipWrapper("LOG_TS", "<html>Used with timestamped log files, this results in a<br>" + 
                                     "timestamped set of boolean results with a value<br>" + 
                                     "of TRUE for each log line that contains the string<br>" +
                                     "represented in the field_id.</html>"),
        // 1
        new ToolTipWrapper("LOG_RANGE", "<html>Similar to LOG_TS, except the timestamped entries<br>" + 
                                        "are ranges delimited by the matching log entries.</html>"),
        new ToolTipWrapper("RANGE_REGEX", "<html>Similar to LOG_RANGE, except the matching string<br>"+
                                        "is a regular expression.</html>"),
        // 2 ***These items below do not appear in the comboboxes, they're here merely for reference
        new ToolTipWrapper("FILE_REGEX_TS", ""), 
      //LINETYPES
        new ToolTipWrapper("HAVESTRING_TS", ""),

        new ToolTipWrapper("REGEX_TS", "")};
    
   public static final ToolTipWrapper[] Operator_ITEMS = new ToolTipWrapper[] {
        //0
        new ToolTipWrapper("RAND_REPLACE", "<html>Replace a symbol with a random integer within a range.</html>"),
        // 1
        new ToolTipWrapper("RAND_REPLACE_UNIQUE", "<html>Like RAND_REPLACE, but does not reuse value.<br> Intended for IP addressees.</html>"), 
        // 2
        new ToolTipWrapper("HASH_CREATE", "<html>Hash a string and write it to a named file.</html>"), 
        // 3
        new ToolTipWrapper("HASH_REPLACE", "<html>Replace a symbol with the hash of a string</html>"),
        new ToolTipWrapper("CLONE_REPLACE", "<html>Replace a symbol with a Clone Instance number.<br>Intended for use with cloned workstations</html>")
   };
    
    public static final Set<String> LOG_ACCESIBLE_FieldType = new HashSet<String>(Arrays.asList(
        new String[] {"CONTAINS", "FILE_REGEX", "SEARCH"}
    ));
    
    public static final Set<String> LOG_TS_ACCESSIBLE_LineType = new HashSet<String>(Arrays.asList(
        new String[] {"HAVESTRING", "REGEX"}
    ));
    
    public static final Set<String> lineParamAccessible = new HashSet<String>(Arrays.asList(
    new String[] {"TOKEN", "PARENS", "QUOTES", "SLASH", "GROUP", "SEARCH"}
   ));
   
   
   public static final Set<String> justFieldType = new HashSet<String>(Arrays.asList(
    new String[] {"LINE_COUNT", "CHECKSUM", "TIME_DELIM", "SIZE"}
   ));
   
   
   public static final Set<String> timeStampDelimiterAccessible = new HashSet<String>(Arrays.asList(
    new String[] {"Service", "Program"}
   ));

}
