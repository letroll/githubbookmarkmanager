package fr.letroll.githubbookmarkmanager.data.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

/**
 * Created by letroll on 01/12/14.
 */
public class StringConverter implements Converter {

    /**
     * VARIABLES *
     */
    public final static String TAG = "StringConverter";

    public static String fromStream(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder out = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
            out.append(newLine);
        }
        return out.toString();
    }

    @Override
    public Object fromBody(TypedInput typedInput, Type type) throws ConversionException {
        String text = null;
        try {
            text = fromStream(typedInput.in());
        } catch (IOException ignored) {/*NOP*/ }

        return text;
    }

    @Override
    public TypedOutput toBody(Object o) {
        return null;
    }
}