package com.bilingualing.epub


class MetaInf
{
    def containerXML;

    public String container()
    {
        containerXML = "<?xml version=\"1.0\"?>"+ System.getProperty("line.separator")+
        "<container version=\"1.0\" xmlns=\"urn:oasis:names:tc:opendocument:xmlns:container\">"+ System.getProperty("line.separator")+
        "<rootfiles>"+ System.getProperty("line.separator")+
        "<rootfile full-path=\"OEBPS/content.opf\" media-type=\"application/oebps-package+xml\" />" + System.getProperty("line.separator")+
        "</rootfiles>"+ System.getProperty("line.separator")+
        "</container>"

        return containerXML;
    }

    public String container(String fullPath)
    {
        containerXML = "<?xml version=\"1.0\"?>"+ System.getProperty("line.separator")+
                "<container version=\"1.0\" xmlns=\"urn:oasis:names:tc:opendocument:xmlns:container\">"+ System.getProperty("line.separator")+
                "<rootfiles>"+ System.getProperty("line.separator")+
                "<rootfile full-path=\"${fullPath}\" media-type=\"application/oebps-package+xml\" />" + System.getProperty("line.separator")+
                "</rootfiles>"+ System.getProperty("line.separator")+
                "</container>"

        return containerXML;
    }
}
