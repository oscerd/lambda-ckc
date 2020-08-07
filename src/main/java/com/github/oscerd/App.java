package com.github.oscerd;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Lambda function entry point. You can change to use other pojo type or implement
 * a different RequestHandler.
 *
 * @see <a href=https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html>Lambda Java Handler</a> for more information
 */
public class App implements RequestHandler<String, Object> {
	
    @Override
    public String handleRequest(final String input, final Context context) {
		LambdaLogger logger = context.getLogger();
        logger.log("Hello " + input);
        return "Hello " + input;
    }
}
