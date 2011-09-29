package org.fusesource.restygwt;


import junit.framework.Test;
import junit.framework.TestCase;

import org.fusesource.restygwt.client.basic.CachingTestGwt;
import org.fusesource.restygwt.client.basic.ExtendedRestTestGwt;
import org.fusesource.restygwt.client.basic.FailingTestGwt;
import org.fusesource.restygwt.client.basic.FlakyTestGwt;
import org.fusesource.restygwt.client.basic.GenericsTestGwt;
import org.fusesource.restygwt.client.basic.JsonCreatorWithSubtypes;
import org.fusesource.restygwt.client.basic.ParameterizedTypeDTO;
import org.fusesource.restygwt.client.basic.ParameterizedTypeServiceInterfaces;
import org.fusesource.restygwt.client.basic.ResourcePassesHeadersTestGwt;
import org.fusesource.restygwt.client.basic.ResourceTestGwt;
import org.fusesource.restygwt.client.basic.SubResourceClientGeneration;
import org.fusesource.restygwt.client.basic.TimeoutTestGwt;
import org.fusesource.restygwt.client.cache.VolatileQueueableCacheStorageTestGwt;
import org.fusesource.restygwt.client.codec.EncoderDecoderTestGwt;
import org.fusesource.restygwt.client.complex.BigNumberTestGwt;
import org.fusesource.restygwt.client.complex.JsonTypeIdResolver;

import com.google.gwt.junit.tools.GWTTestSuite;


/**
 *
 * <p>
 * <ul>
 * <li>Add GWTTestCases here</li>
 * <li>See also <a href="http://mojo.codehaus.org/gwt-maven-plugin/user-guide/testing.html">maven docu</a></li>
 * </ul>
 *
 * IMPORTANT: Naming convention
 * <ul>
 * <li>Fast Junit Tests: end with "Test". Correct example: MyTest.java</li>
 * <li>GWT Tests: do NOT end with "Test". Do NOT start with GwtTest. Correct example: DateBeautifierTestGwt.java</li>
 * </ul>
 * </p>
 *
 * @author <a href="mailto:mail@raphaelbauer.com">rEyez</<a>
 */
public class GwtCompleteTestSuite extends TestCase {


    /**
     * @return the suite of that module
     */
    public static Test suite() {
        GWTTestSuite suite = new GWTTestSuite("all GwtTestCases but AnnotationResolver" );

        suite.addTestSuite(FlakyTestGwt.class);
        suite.addTestSuite(TimeoutTestGwt.class);
        suite.addTestSuite(CachingTestGwt.class);
        suite.addTestSuite(ExtendedRestTestGwt.class);
        suite.addTestSuite(BigNumberTestGwt.class);
        suite.addTestSuite(ResourceTestGwt.class);
        suite.addTestSuite(ResourcePassesHeadersTestGwt.class);
        suite.addTestSuite(VolatileQueueableCacheStorageTestGwt.class);       
        suite.addTestSuite(FailingTestGwt.class);
        suite.addTestSuite(EncoderDecoderTestGwt.class);
        suite.addTestSuite(GenericsTestGwt.class);
        suite.addTestSuite(ParameterizedTypeDTO.class);
        suite.addTestSuite(ParameterizedTypeServiceInterfaces.class);
        suite.addTestSuite(SubResourceClientGeneration.class);
        suite.addTestSuite(JsonTypeIdResolver.class);
        suite.addTestSuite(JsonCreatorWithSubtypes.class);
        return suite;
    }
}
