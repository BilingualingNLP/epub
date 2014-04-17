package com.bilingualing.epub

class HTML
{
    def page;

    HTML()
    {
        super();
    }

    public HTML openHtml()
    {
        page = page+"<html>" + System.getProperty("line.separator");
        return this;
    }

    public HTML closeHtml()
    {
        page = page+"</html>" + System.getProperty("line.separator");
        return this;
    }

    public HTML openTable()
    {
        page = page+"<table>" + System.getProperty("line.separator");
        return this;
    }

    public HTML closeTable()
    {
        page = page+"</table>" + System.getProperty("line.separator");
        return this;
    }

    public HTML openBody()
    {
        page = page+"<body>" + System.getProperty("line.separator");
        return this;
    }

    public HTML closeBody()
    {
        page = page+"</body>" + System.getProperty("line.separator");
        return this;
    }
    public HTML openStyle()
    {
        page = page+"<style>"+System.getProperty("line.separator");
        return this;
    }

    public HTML closeStyle()
    {
        page = page+"</style>"+System.getProperty("line.separator");
        return this;
    }

    public HTML addStyle(String klass, String attribute, String value)
    {
        page = page+".${klass}: {${attribute} : ${value};}"+System.getProperty("line.separator");
        return this;
    }

    public HTML openHead()
    {
        page = page+"<head>"+ System.getProperty("line.separator")+"<meta charset=\"utf-8\"/>";
        return this;
    }

    public HTML closeHead()
    {
        page = page+"</head>" + System.getProperty("line.separator");
        return this;
    }

    public HTML openDiv()
    {
        page = page+"<div>"+ System.getProperty("line.separator");
        return this;
    }

    public HTML openDiv(String id, String klass)
    {
        page = page+"<div id=${id} class=${klass}>" + System.getProperty("line.separator");
        return this;
    }

    public HTML openDiv(String attribute, Boolean idOrclass)
    {
        if(idOrclass == true)
        {
            page = page+"<div id=${attribute}>" + System.getProperty("line.separator");
        }
        else
        {
            page = page+"<div class=${attribute}>" + System.getProperty("line.separator");
        }

        return this;
    }


    public HTML closeDiv()
    {
        page = page+"</div>" + System.getProperty("line.separator");
        return this;
    }

    public HTML openTD()
    {
        page = page+"<td>" + System.getProperty("line.separator");
        return this;
    }

    public HTML closeTD()
    {
        page = page+"</td>" + System.getProperty("line.separator");
        return this;
    }

    public HTML openTR()
    {
        page = page+"<tr>" + System.getProperty("line.separator");
        return this;
    }

    public HTML closeTR()
    {
        page = page+"</tr>" + System.getProperty("line.separator");
        return this;
    }

    public HTML openP()
    {
        page = page+"<p>" + System.getProperty("line.separator");
        return this;
    }

    public HTML closeP()
    {
        page = page+"</p>" + System.getProperty("line.separator");
        return this;
    }
}