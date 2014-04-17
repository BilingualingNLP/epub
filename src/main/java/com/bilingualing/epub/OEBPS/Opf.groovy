package com.bilingualing.epub.OEBPS

/**
 * Created with IntelliJ IDEA.
 * User: jamaaltaylor
 * Date: 4/16/14
 * Time: 6:49 PM
 * To change this template use File | Settings | File Templates.
 */
class Opf
{
    def contentOpf;
    def newLine = System.getProperty("line.separator");

    public Opf()
    {
        super();
    }

    public Opf xmlDeclarations()
    {
        contentOpf = "<?xml version='1.0' encoding='utf-8'?>" + newLine;
        return this
    }

    public openPackage()
    {
        contentOpf = "<package xmlns=\"http://www.idpf.org/2007/opf\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" unique-identifier=\"bookid\" version=\"2.0\">"+newLine;
        return this;
    }

    public closePackage()
    {
        contentOpf="</package>";
        return this;
    }

    public Opf openMetadata()
    {
        contentOpf = "<metadata>" + newLine;
        return this;
    }

    public Opf closeMetadata()
    {
        contentOpf = "</metadata>" + newLine;
        return this;
    }

    public Opf title(String title)
    {
        contentOpf = "<dc:title>${title}</dc:title>" + newLine;
        return this;
    }

    public Opf creator(String creator)
    {
        contentOpf = "<dc:creator>${creator}</dc:creator>" + newLine;
        return this;
    }

    public Opf identifier(String identifier)
    {
        contentOpf = "<dc:identifier id=\"bookid\">${identifier}</dc:identifier>" + newLine;
        return this;
    }

    public Opf language(String language)
    {
        contentOpf = "<dc:language>${language}</dc:language>" + newLine;
        return this;
    }

    public Opf date(String date)
    {
        contentOpf = "<dc:date>${date}</dc:date>" + newLine;
        return this;
    }

    public Opf publisher(String publisher)
    {
        contentOpf = "<dc:publisher>${publisher}</dc:publisher>" + newLine;
        return this;
    }

    public Opf copyRightInformation(String rights)
    {
        contentOpf = "<dc:rights>${rights}</dc:rights>" + newLine;
        return this;
    }

    public Opf openManifest()
    {
        contentOpf = "<manifest>" + newLine;
        return this;
    }

    public Opf closeManifest()
    {
        contentOpf = "</manifest>"+ newLine;
        return this;
    }

    public Opf item(String id, String href, String mediaType)
    {
        contentOpf = "<item id=\"${id}\" href=\"${href}\" media-type=\"${mediaType}\" />"+newLine;
        return this;
    }

    public Opf openSpine(String toc)
    {
        contentOpf = "<spine toc=\"${toc}\">"+newLine;
        return this;
    }

    public Opf closeSpine()
    {
        contentOpf = "</spine>";
        return this;
    }

    public Opf itemref(String idref, String linear)
    {
        contentOpf = "<itemref idref=\"${idref}\" linear=\"${linear}\"/>"+newLine;
        return this;
    }

    public openGuide()
    {
        contentOpf = "<guide>"+newLine;
        return this;
    }

    public closeGuide()
    {
        contentOpf = "</guide>"+newLine;
        return  this;
    }

    public reference(String href, String type, String title)
    {
        contentOpf = "<reference href=\"${href}\" type=\"${type}\" title="${title}" "
    }


}
