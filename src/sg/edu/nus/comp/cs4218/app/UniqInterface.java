package sg.edu.nus.comp.cs4218.app;

import sg.edu.nus.comp.cs4218.Application;

import java.io.InputStream;

public interface UniqInterface extends Application {

    /**
     * Filters adjacent matching lines from INPUT_FILE or standard input and writes to an OUTPUT_FILE or to standard output.
     *
     * @param isCount          Boolean option to prefix lines by the number of occurrences of adjacent duplicate lines
     * @param isRepeated       Boolean option to print only duplicate lines, one for each group
     * @param isAllRepeated    Boolean option to print all duplicate lines (takes precedence if isRepeated is set to true)
     * @param isUnique         Boolean option to print only unique lines
     * @param isIgnoreCase     Boolean option to ignore cases
     * @param isSkipNChars     Boolean option to skip the first N characters when comparing (Refer to numOfCharsToSkip parameter for N)
     * @param numOfCharsToSkip The number of characters (N) to skip when comparing (Applicable when isSkipNChars is set to true)
     * @param inputFileName    of path to input file
     * @return
     * @throws Exception
     */
    String uniqFromFile(Boolean isCount, Boolean isRepeated, Boolean isAllRepeated, Boolean isUnique, Boolean isIgnoreCase, Boolean isSkipNChars, int numOfCharsToSkip,
                        String inputFileName) throws Exception;


    /**
     * Filters adjacent matching lines from INPUT_FILE or standard input and writes to an OUTPUT_FILE or to standard output.
     *
     * @param isCount          Boolean option to prefix lines by the number of occurrences of adjacent duplicate lines
     * @param isRepeated       Boolean option to print only duplicate lines, one for each group
     * @param isAllRepeated    Boolean option to print all duplicate lines (takes precedence if isRepeated is set to true)
     * @param isUnique         Boolean option to print only unique lines
     * @param isIgnoreCase     Boolean option to ignore cases
     * @param isSkipNChars     Boolean option to skip the first N characters when comparing (Refer to numOfCharsToSkip parameter for N)
     * @param numOfCharsToSkip The number of characters (N) to skip when comparing (Applicable when isSkipNChars is set to true)
     * @param stdin            InputStream containing arguments from Stdin
     * @return
     * @throws Exception
     */
    String uniqFromStdin(Boolean isCount, Boolean isRepeated, Boolean isAllRepeated, Boolean isUnique, Boolean isIgnoreCase, Boolean isSkipNChars, int numOfCharsToSkip,
                         InputStream stdin) throws Exception;
}
