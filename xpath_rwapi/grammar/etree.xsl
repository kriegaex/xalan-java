<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:g="http://www.w3.org/2001/03/XPath/grammar">

  <xsl:import href="jjtree.xsl"/>

  <!-- override jjtree.xsl -->
	<xsl:template name="javacc-options">
	  <!-- xsl:apply-imports/ -->
    STATIC = false;
    MULTI=false;
    // NODE_PACKAGE="org.apache.xpath.operations";
    NODE_PREFIX="";
    NODE_FACTORY=true; 
    VISITOR=true;     // invokes the JJTree Visitor support
    NODE_SCOPE_HOOK=false;
    NODE_USES_PARSER=true;
	</xsl:template>

    <!-- Dependency with build.xml:parser.package and parser.dir 12-Mar-03 -sc -->
	<xsl:template name="set-parser-package">
package org.apache.xpath.impl.parser;
	</xsl:template>

    <xsl:template name="extra-parser-code">
    // Begin generated by etree.xsl:extra-parser-code 
  
    int m_predLevel = 0;

    /**
     * Node factory for customized parser.  
     */
    NodeFactory m_nodeFactory;

    /**
     * Sets the node factory.  
     * @param nodeFactory to use.
     */
    public void setNodeFactory(NodeFactory nodeFactory) {      		
    	m_nodeFactory = nodeFactory;
    }

    /**
     * Returns the node factory.  
     * @return NodeFactory
     */
    public NodeFactory getNodeFactory() {
    	return m_nodeFactory;
    }

	
    /**
     * The "version" property as pertains to the XPath spec.
     * @serial
     */
    private double m_version;

    /**
     * Set the "version" property for XPath.
     *
     * @param v Value for the "version" property.
     */
    public void setVersion(double v)
    {
        m_version = v;
    }

    /**
     * Get the "version" property for XPath.
     *
     * @return The value of the "version" property.
     */
    public double getVersion()
    {
        return m_version;
    }
    // end generated by etree.xsl:extra-parser-code 

    </xsl:template>

</xsl:stylesheet>
