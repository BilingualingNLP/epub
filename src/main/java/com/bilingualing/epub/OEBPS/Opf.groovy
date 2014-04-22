package com.bilingualing.epub.OEBPS

import groovy.xml.MarkupBuilder

/**
 * Created with IntelliJ IDEA.
 * User: jamaaltaylor
 * Date: 4/16/14
 * Time: 6:49 PM
 * To change this template use File | Settings | File Templates.
 */
class Opf
{
    def writer = new StringWriter();
    def xml = new MarkupBuilder(writer);
    def xmlnsDc = "xmlns:dc"
    def uniqueIdentifier = "unique-identifier"
    def dcTitle = "dc:title"
    def dcCreator = "dc:creator"
    def contentOpf;
    def newLine = System.getProperty("line.separator");

    public Opf()
    {
        super();
    }

    def generateOpf(def metaInfo, def itemrefs)
    {
        xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
        xml.package(xmlns:'http://www.idpf.org/2007/opf', (xmlnsDc):'http://purl.org/dc/elements/1.1/', (uniqueIdentifier):'bookid', version:'2.0')
        {
            metadata()
            {
                generateMetadata(metaInfo)
            }

        }
    }

    /**
     * The two required terms are title and identifier.
     * According to the EPUB specification, the identifier must be a unique value,
     * although it's up to the digital book creator to define that unique value.
     * For book publishers, this field will typically contain an ISBN or Library of Congress number.
     * For other EPUB creators, consider using a URL or a large, randomly generated unique user ID (UUID).
     * Note that the value of the attribute unique-identifier must match the ID attribute of the dc:identifier element.
     */
    def generateMetadata(def metaInfo)
    {
        dc:title(metaInfo.title)
        dc:creator(metaInfo.creator)
        dc:identifier(id:'bookid', metaInfo.identifier)
        if(metaInfo.language1){dc:language(metaInfo.language1)}
        if(metaInfo.language2){dc:language(metaInfo.language2)}
        if(metaInfo.date){dc:data(metaInfo.publicationDate)}
        if(metaInfo.publisher){dc:publisher(metaInfo.publisher)}

        meta('', name:'cover', content:'conver-image')
    }

    def generateSpine(def itemrefs)
    {
        spine(toc:'ncx')
        {
            itemrefs.each{ itemref('', idref:${it})}
        }
    }

    def generateGuide()
    {

    }
}
