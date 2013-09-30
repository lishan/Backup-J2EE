<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<tiles:insertTemplate template="/template/template.jsp">
    <tiles:putAttribute name="script" value=""/>
    <tiles:putAttribute name="title" value="Home"/>
    <tiles:putAttribute name="nav" type="string">
        <div class="uk-width-2-3 uk-container-center uk-container">
            <nav class="uk-navbar">
                <ul class="uk-navbar-nav">
                    <li><a href="" class="uk-navbar-nav-subtitle">
                        <i class="uk-icon-home"></i>
                        Home
                        <div>
                            To home page
                        </div>
                    </a></li>
                </ul>
                <div class="uk-navbar-flip">
                    <li>
                        <a href="" class="uk-navbar-brand">
                            <i class="uk-icon-group"></i>
                            Login
                        </a>
                    </li>
                </div>
            </nav>
        </div>
    </tiles:putAttribute>
    <tiles:putAttribute name="body" type="string">
        <div class="uk-width-2-3 uk-container-center uk-container">
            <article class="uk-comment">
                <header class="uk-comment-header">
                    <img class="uk-comment-avatar" src="" alt="">
                    <h4 class="uk-comment-title">Author</h4>
                    <div class="uk-comment-meta">Written by Super User on 12 April 2012. Posted in Blog</div>
                </header>
            </article>
        </div>
    </tiles:putAttribute>
    <tiles:putAttribute name="footer" type="string">

    </tiles:putAttribute>
</tiles:insertTemplate>