package com.bilingualing.epub

import groovy.xml.MarkupBuilder

class HTML
{
    def writer = new StringWriter();
    def builder = new MarkupBuilder(writer);

    HTML(builder)
    {
        this.builder = builder
    }

    def html(builder,String content)
    {
        builder.html()
    }

    def table(builder)
    {
        builder.table()
    }

    def body(builder)
    {
        builder.body()
    }

    def head(builder)
    {
        builder.head()
    }

    def style(builder)
    {
        builder.style()
    }

    def div(builder)
    {
        builder.div()
    }

    def td(builder)
    {
        builder.td()
    }

    def tr(builder)
    {
        builder.tr()
    }

    def p(builder)
    {
        builder.p()
    }


}