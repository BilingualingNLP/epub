package com.bilingualing.epub

import groovy.xml.MarkupBuilder
import groovy.xml.StreamingMarkupBuilder;

class MetaInf
{
    def writer = new StringWriter();
    def xml = new MarkupBuilder(writer);
    def fullPath="full-path"
    def mediaType="media-type"


    def generateContainer()
    {
        xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
        xml.container(version:'1.0', xmlns:'urn:oasis:names:tc:opendocument:xmlns:container')
        {
            rootfiles
            {
                rootfile((fullPath):'OEBPS/content.opf',(mediaType):'application/oebps-package+xml')
            }
        }

        new File("container.xml").write(writer.toString())
    }

    def generateContainer(String fullPath)
    {
        xml.mkp.xmlDeclaration()
        xml.container(version:'1.0', xmlns:'urn:oasis:names:tc:opendocument:xmlns:container')
        {
            rootfiles
            {
                rootfile((fullPath):'${fullPath}',(mediaType):'application/oebps-package+xml')
            }
        }

        new File("container.xml").write(writer.toString())
    }

}
