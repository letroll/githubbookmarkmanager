package fr.letroll.githubbookmarkmanager.api.model

/**
 * Created by letroll on 30/11/14.
 */

open class Repo(){
    private val id: Integer
    private var name: String
    private var fullName: String
    private var owner: Owner
    private var _private: Boolean
    private var htmlUrl: String
    private var description: String
    private var fork: Boolean
    private var url: String
    private var forksUrl: String
    private var keysUrl: String
    private var collaboratorsUrl: String
    private var teamsUrl: String
    private var hooksUrl: String
    private var issueEventsUrl: String
    private var eventsUrl: String
    private var assigneesUrl: String
    private var branchesUrl: String
    private var tagsUrl: String
    private var blobsUrl: String
    private var gitTagsUrl: String
    private var gitRefsUrl: String
    private var treesUrl: String
    private var statusesUrl: String
    private var languagesUrl: String
    private var stargazersUrl: String
    private var contributorsUrl: String
    private var subscribersUrl: String
    private var subscriptionUrl: String
    private var commitsUrl: String
    private var gitCommitsUrl: String
    private var commentsUrl: String
    private var issueCommentUrl: String
    private var contentsUrl: String
    private var compareUrl: String
    private var mergesUrl: String
    private var archiveUrl: String
    private var downloadsUrl: String
    private var issuesUrl: String
    private var pullsUrl: String
    private var milestonesUrl: String
    private var notificationsUrl: String
    private var labelsUrl: String
    private var releasesUrl: String
    private var createdAt: String
    private var updatedAt: String
    private var pushedAt: String
    private var gitUrl: String
    private var sshUrl: String
    private var cloneUrl: String
    private var svnUrl: String
    private var homepage: String
    private var size: Integer
    private var stargazersCount: Integer
    private var watchersCount: Integer
    private var language: String
    private var hasIssues: Boolean
    private var hasDownloads: Boolean
    private var hasWiki: Boolean
    private var hasPages: Boolean
    private var forksCount: Integer
    private var mirrorUrl: Object
    private var openIssuesCount: Integer
    private var forks: Integer
    private var openIssues: Integer
    private var watchers: Integer
    private var defaultBranch: String
    private var additionalProperties: Map<String, kotlin.Any> = HashMap<String, kotlin>();

    /**
     *
     * @return
     * The id
     */
    public fun getId(): Integer {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public fun setId(id: Integer) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public fun getName(): String {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public fun setName(name: String) {
        this.name = name;
    }

    /**
     *
     * @return
     * The fullName
     */
    public fun getFullName(): String {
        return fullName;
    }

    /**
     *
     * @param fullName
     * The full_name
     */
    public fun setFullName(fullName: String) {
        this.fullName = fullName;
    }

    /**
     *
     * @return
     * The owner
     */
    public fun getOwner(): Owner {
        return owner;
    }

    /**
     *
     * @param owner
     * The owner
     */
    public fun setOwner(owner: Owner) {
        this.owner = owner;
    }

    /**
     *
     * @return
     * The _private
     */
    public fun getPrivate(): Boolean {
        return _private;
    }

    /**
     *
     * @param _private
     * The private
     */
    public fun setPrivate(_private: Boolean) {
        this._private = _private;
    }

    /**
     *
     * @return
     * The htmlUrl
     */
    public fun getHtmlUrl(): String {
        return htmlUrl;
    }

    /**
     *
     * @param htmlUrl
     * The html_url
     */
    public fun setHtmlUrl(htmlUrl: String) {
        this.htmlUrl = htmlUrl;
    }

    /**
     *
     * @return
     * The description
     */
    public fun getDescription(): String {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public fun setDescription(description: String) {
        this.description = description;
    }

    /**
     *
     * @return
     * The fork
     */
    public fun getFork(): Boolean {
        return fork;
    }

    /**
     *
     * @param fork
     * The fork
     */
    public fun setFork(fork: Boolean) {
        this.fork = fork;
    }

    /**
     *
     * @return
     * The url
     */
    public fun getUrl(): String {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public fun setUrl(url: String) {
        this.url = url;
    }

    /**
     *
     * @return
     * The forksUrl
     */
    public fun getForksUrl(): String {
        return forksUrl;
    }

    /**
     *
     * @param forksUrl
     * The forks_url
     */
    public fun setForksUrl(forksUrl: String) {
        this.forksUrl = forksUrl;
    }

    /**
     *
     * @return
     * The keysUrl
     */
    public fun getKeysUrl(): String {
        return keysUrl;
    }

    /**
     *
     * @param keysUrl
     * The keys_url
     */
    public fun setKeysUrl(keysUrl: String) {
        this.keysUrl = keysUrl;
    }

    /**
     *
     * @return
     * The collaboratorsUrl
     */
    public fun getCollaboratorsUrl(): String {
        return collaboratorsUrl;
    }

    /**
     *
     * @param collaboratorsUrl
     * The collaborators_url
     */
    public fun setCollaboratorsUrl(collaboratorsUrl: String) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    /**
     *
     * @return
     * The teamsUrl
     */
    public fun getTeamsUrl(): String {
        return teamsUrl;
    }

    /**
     *
     * @param teamsUrl
     * The teams_url
     */
    public fun setTeamsUrl(teamsUrl: String) {
        this.teamsUrl = teamsUrl;
    }

    /**
     *
     * @return
     * The hooksUrl
     */
    public fun getHooksUrl(): String {
        return hooksUrl;
    }

    /**
     *
     * @param hooksUrl
     * The hooks_url
     */
    public fun setHooksUrl(hooksUrl: String) {
        this.hooksUrl = hooksUrl;
    }

    /**
     *
     * @return
     * The issueEventsUrl
     */
    public fun getIssueEventsUrl(): String {
        return issueEventsUrl;
    }

    /**
     *
     * @param issueEventsUrl
     * The issue_events_url
     */
    public fun setIssueEventsUrl(issueEventsUrl: String) {
        this.issueEventsUrl = issueEventsUrl;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public fun getEventsUrl(): String {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public fun setEventsUrl(eventsUrl: String) {
        this.eventsUrl = eventsUrl;
    }

    /**
     *
     * @return
     * The assigneesUrl
     */
    public fun getAssigneesUrl(): String {
        return assigneesUrl;
    }

    /**
     *
     * @param assigneesUrl
     * The assignees_url
     */
    public fun setAssigneesUrl(assigneesUrl: String) {
        this.assigneesUrl = assigneesUrl;
    }

    /**
     *
     * @return
     * The branchesUrl
     */
    public fun getBranchesUrl(): String {
        return branchesUrl;
    }

    /**
     *
     * @param branchesUrl
     * The branches_url
     */
    public fun setBranchesUrl(branchesUrl: String) {
        this.branchesUrl = branchesUrl;
    }

    /**
     *
     * @return
     * The tagsUrl
     */
    public fun getTagsUrl(): String {
        return tagsUrl;
    }

    /**
     *
     * @param tagsUrl
     * The tags_url
     */
    public fun setTagsUrl(tagsUrl: String) {
        this.tagsUrl = tagsUrl;
    }

    /**
     *
     * @return
     * The blobsUrl
     */
    public fun getBlobsUrl(): String {
        return blobsUrl;
    }

    /**
     *
     * @param blobsUrl
     * The blobs_url
     */
    public fun setBlobsUrl(blobsUrl: String) {
        this.blobsUrl = blobsUrl;
    }

    /**
     *
     * @return
     * The gitTagsUrl
     */
    public fun getGitTagsUrl(): String {
        return gitTagsUrl;
    }

    /**
     *
     * @param gitTagsUrl
     * The git_tags_url
     */
    public fun setGitTagsUrl(gitTagsUrl: String) {
        this.gitTagsUrl = gitTagsUrl;
    }

    /**
     *
     * @return
     * The gitRefsUrl
     */
    public fun getGitRefsUrl(): String {
        return gitRefsUrl;
    }

    /**
     *
     * @param gitRefsUrl
     * The git_refs_url
     */
    public fun setGitRefsUrl(gitRefsUrl: String) {
        this.gitRefsUrl = gitRefsUrl;
    }

    /**
     *
     * @return
     * The treesUrl
     */
    public fun getTreesUrl(): String {
        return treesUrl;
    }

    /**
     *
     * @param treesUrl
     * The trees_url
     */
    public fun setTreesUrl(treesUrl: String) {
        this.treesUrl = treesUrl;
    }

    /**
     *
     * @return
     * The statusesUrl
     */
    public fun getStatusesUrl(): String {
        return statusesUrl;
    }

    /**
     *
     * @param statusesUrl
     * The statuses_url
     */
    public fun setStatusesUrl(statusesUrl: String) {
        this.statusesUrl = statusesUrl;
    }

    /**
     *
     * @return
     * The languagesUrl
     */
    public fun getLanguagesUrl(): String {
        return languagesUrl;
    }

    /**
     *
     * @param languagesUrl
     * The languages_url
     */
    public fun setLanguagesUrl(languagesUrl: String) {
        this.languagesUrl = languagesUrl;
    }

    /**
     *
     * @return
     * The stargazersUrl
     */
    public fun getStargazersUrl(): String {
        return stargazersUrl;
    }

    /**
     *
     * @param stargazersUrl
     * The stargazers_url
     */
    public fun setStargazersUrl(stargazersUrl: String) {
        this.stargazersUrl = stargazersUrl;
    }

    /**
     *
     * @return
     * The contributorsUrl
     */
    public fun getContributorsUrl(): String {
        return contributorsUrl;
    }

    /**
     *
     * @param contributorsUrl
     * The contributors_url
     */
    public fun setContributorsUrl(contributorsUrl: String) {
        this.contributorsUrl = contributorsUrl;
    }

    /**
     *
     * @return
     * The subscribersUrl
     */
    public fun getSubscribersUrl(): String {
        return subscribersUrl;
    }

    /**
     *
     * @param subscribersUrl
     * The subscribers_url
     */
    public fun setSubscribersUrl(subscribersUrl: String) {
        this.subscribersUrl = subscribersUrl;
    }

    /**
     *
     * @return
     * The subscriptionUrl
     */
    public fun getSubscriptionUrl(): String {
        return subscriptionUrl;
    }

    /**
     *
     * @param subscriptionUrl
     * The subscription_url
     */
    public fun setSubscriptionUrl(subscriptionUrl: String) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     *
     * @return
     * The commitsUrl
     */
    public fun getCommitsUrl(): String {
        return commitsUrl;
    }

    /**
     *
     * @param commitsUrl
     * The commits_url
     */
    public fun setCommitsUrl(commitsUrl: String) {
        this.commitsUrl = commitsUrl;
    }

    /**
     *
     * @return
     * The gitCommitsUrl
     */
    public fun getGitCommitsUrl(): String {
        return gitCommitsUrl;
    }

    /**
     *
     * @param gitCommitsUrl
     * The git_commits_url
     */
    public fun setGitCommitsUrl(gitCommitsUrl: String) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    /**
     *
     * @return
     * The commentsUrl
     */
    public fun getCommentsUrl(): String {
        return commentsUrl;
    }

    /**
     *
     * @param commentsUrl
     * The comments_url
     */
    public fun setCommentsUrl(commentsUrl: String) {
        this.commentsUrl = commentsUrl;
    }

    /**
     *
     * @return
     * The issueCommentUrl
     */
    public fun getIssueCommentUrl(): String {
        return issueCommentUrl;
    }

    /**
     *
     * @param issueCommentUrl
     * The issue_comment_url
     */
    public fun setIssueCommentUrl(issueCommentUrl: String) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
     *
     * @return
     * The contentsUrl
     */
    public fun getContentsUrl(): String {
        return contentsUrl;
    }

    /**
     *
     * @param contentsUrl
     * The contents_url
     */
    public fun setContentsUrl(contentsUrl: String) {
        this.contentsUrl = contentsUrl;
    }

    /**
     *
     * @return
     * The compareUrl
     */
    public fun getCompareUrl(): String {
        return compareUrl;
    }

    /**
     *
     * @param compareUrl
     * The compare_url
     */
    public fun setCompareUrl(compareUrl: String) {
        this.compareUrl = compareUrl;
    }

    /**
     *
     * @return
     * The mergesUrl
     */
    public fun getMergesUrl(): String {
        return mergesUrl;
    }

    /**
     *
     * @param mergesUrl
     * The merges_url
     */
    public fun setMergesUrl(mergesUrl: String) {
        this.mergesUrl = mergesUrl;
    }

    /**
     *
     * @return
     * The archiveUrl
     */
    public fun getArchiveUrl(): String {
        return archiveUrl;
    }

    /**
     *
     * @param archiveUrl
     * The archive_url
     */
    public fun setArchiveUrl(archiveUrl: String) {
        this.archiveUrl = archiveUrl;
    }

    /**
     *
     * @return
     * The downloadsUrl
     */
    public fun getDownloadsUrl(): String {
        return downloadsUrl;
    }

    /**
     *
     * @param downloadsUrl
     * The downloads_url
     */
    public fun setDownloadsUrl(downloadsUrl: String) {
        this.downloadsUrl = downloadsUrl;
    }

    /**
     *
     * @return
     * The issuesUrl
     */
    public fun getIssuesUrl(): String {
        return issuesUrl;
    }

    /**
     *
     * @param issuesUrl
     * The issues_url
     */
    public fun setIssuesUrl(issuesUrl: String) {
        this.issuesUrl = issuesUrl;
    }

    /**
     *
     * @return
     * The pullsUrl
     */
    public fun getPullsUrl(): String {
        return pullsUrl;
    }

    /**
     *
     * @param pullsUrl
     * The pulls_url
     */
    public fun setPullsUrl(pullsUrl: String) {
        this.pullsUrl = pullsUrl;
    }

    /**
     *
     * @return
     * The milestonesUrl
     */
    public fun getMilestonesUrl(): String {
        return milestonesUrl;
    }

    /**
     *
     * @param milestonesUrl
     * The milestones_url
     */
    public fun setMilestonesUrl(milestonesUrl: String) {
        this.milestonesUrl = milestonesUrl;
    }

    /**
     *
     * @return
     * The notificationsUrl
     */
    public fun getNotificationsUrl(): String {
        return notificationsUrl;
    }

    /**
     *
     * @param notificationsUrl
     * The notifications_url
     */
    public fun setNotificationsUrl(notificationsUrl: String) {
        this.notificationsUrl = notificationsUrl;
    }

    /**
     *
     * @return
     * The labelsUrl
     */
    public fun getLabelsUrl(): String {
        return labelsUrl;
    }

    /**
     *
     * @param labelsUrl
     * The labels_url
     */
    public fun setLabelsUrl(labelsUrl: String) {
        this.labelsUrl = labelsUrl;
    }

    /**
     *
     * @return
     * The releasesUrl
     */
    public fun getReleasesUrl(): String {
        return releasesUrl;
    }

    /**
     *
     * @param releasesUrl
     * The releases_url
     */
    public fun setReleasesUrl(releasesUrl: String) {
        this.releasesUrl = releasesUrl;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public fun getCreatedAt(): String {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public fun setCreatedAt(createdAt: String) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    public fun getUpdatedAt(): String {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    public fun setUpdatedAt(updatedAt: String) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return
     * The pushedAt
     */
    public fun getPushedAt(): String {
        return pushedAt;
    }

    /**
     *
     * @param pushedAt
     * The pushed_at
     */
    public fun setPushedAt(pushedAt: String) {
        this.pushedAt = pushedAt;
    }

    /**
     *
     * @return
     * The gitUrl
     */
    public fun getGitUrl(): String {
        return gitUrl;
    }

    /**
     *
     * @param gitUrl
     * The git_url
     */
    public fun setGitUrl(gitUrl: String) {
        this.gitUrl = gitUrl;
    }

    /**
     *
     * @return
     * The sshUrl
     */
    public fun getSshUrl(): String {
        return sshUrl;
    }

    /**
     *
     * @param sshUrl
     * The ssh_url
     */
    public fun setSshUrl(sshUrl: String) {
        this.sshUrl = sshUrl;
    }

    /**
     *
     * @return
     * The cloneUrl
     */
    public fun getCloneUrl(): String {
        return cloneUrl;
    }

    /**
     *
     * @param cloneUrl
     * The clone_url
     */
    public fun setCloneUrl(cloneUrl: String) {
        this.cloneUrl = cloneUrl;
    }

    /**
     *
     * @return
     * The svnUrl
     */
    public fun getSvnUrl(): String {
        return svnUrl;
    }

    /**
     *
     * @param svnUrl
     * The svn_url
     */
    public fun setSvnUrl(svnUrl: String) {
        this.svnUrl = svnUrl;
    }

    /**
     *
     * @return
     * The homepage
     */
    public fun getHomepage(): String {
        return homepage;
    }

    /**
     *
     * @param homepage
     * The homepage
     */
    public fun setHomepage(homepage: String) {
        this.homepage = homepage;
    }

    /**
     *
     * @return
     * The size
     */
    public fun getSize(): Integer {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public fun setSize(size: Integer) {
        this.size = size;
    }

    /**
     *
     * @return
     * The stargazersCount
     */
    public fun getStargazersCount(): Integer {
        return stargazersCount;
    }

    /**
     *
     * @param stargazersCount
     * The stargazers_count
     */
    public fun setStargazersCount(stargazersCount: Integer) {
        this.stargazersCount = stargazersCount;
    }

    /**
     *
     * @return
     * The watchersCount
     */
    public fun getWatchersCount(): Integer {
        return watchersCount;
    }

    /**
     *
     * @param watchersCount
     * The watchers_count
     */
    public fun setWatchersCount(watchersCount: Integer) {
        this.watchersCount = watchersCount;
    }

    /**
     *
     * @return
     * The language
     */
    public fun getLanguage(): String {
        return language;
    }

    /**
     *
     * @param language
     * The language
     */
    public fun setLanguage(language: String) {
        this.language = language;
    }

    /**
     *
     * @return
     * The hasIssues
     */
    public fun getHasIssues(): Boolean {
        return hasIssues;
    }

    /**
     *
     * @param hasIssues
     * The has_issues
     */
    public fun setHasIssues(hasIssues: Boolean) {
        this.hasIssues = hasIssues;
    }

    /**
     *
     * @return
     * The hasDownloads
     */
    public fun getHasDownloads(): Boolean {
        return hasDownloads;
    }

    /**
     *
     * @param hasDownloads
     * The has_downloads
     */
    public fun setHasDownloads(hasDownloads: Boolean) {
        this.hasDownloads = hasDownloads;
    }

    /**
     *
     * @return
     * The hasWiki
     */
    public fun getHasWiki(): Boolean {
        return hasWiki;
    }

    /**
     *
     * @param hasWiki
     * The has_wiki
     */
    public fun setHasWiki(hasWiki: Boolean) {
        this.hasWiki = hasWiki;
    }

    /**
     *
     * @return
     * The hasPages
     */
    public fun getHasPages(): Boolean {
        return hasPages;
    }

    /**
     *
     * @param hasPages
     * The has_pages
     */
    public fun setHasPages(hasPages: Boolean) {
        this.hasPages = hasPages;
    }

    /**
     *
     * @return
     * The forksCount
     */
    public fun getForksCount(): Integer {
        return forksCount;
    }

    /**
     *
     * @param forksCount
     * The forks_count
     */
    public fun setForksCount(forksCount: Integer) {
        this.forksCount = forksCount;
    }

    /**
     *
     * @return
     * The mirrorUrl
     */
    public fun getMirrorUrl(): Object {
        return mirrorUrl;
    }

    /**
     *
     * @param mirrorUrl
     * The mirror_url
     */
    public fun setMirrorUrl(mirrorUrl: Object) {
        this.mirrorUrl = mirrorUrl;
    }

    /**
     *
     * @return
     * The openIssuesCount
     */
    public fun getOpenIssuesCount(): Integer {
        return openIssuesCount;
    }

    /**
     *
     * @param openIssuesCount
     * The open_issues_count
     */
    public fun setOpenIssuesCount(openIssuesCount: Integer) {
        this.openIssuesCount = openIssuesCount;
    }

    /**
     *
     * @return
     * The forks
     */
    public fun getForks(): Integer {
        return forks;
    }

    /**
     *
     * @param forks
     * The forks
     */
    public fun setForks(forks: Integer) {
        this.forks = forks;
    }

    /**
     *
     * @return
     * The openIssues
     */
    public fun getOpenIssues(): Integer {
        return openIssues;
    }

    /**
     *
     * @param openIssues
     * The open_issues
     */
    public fun setOpenIssues(openIssues: Integer) {
        this.openIssues = openIssues;
    }

    /**
     *
     * @return
     * The watchers
     */
    public fun getWatchers(): Integer {
        return watchers;
    }

    /**
     *
     * @param watchers
     * The watchers
     */
    public fun setWatchers(watchers: Integer) {
        this.watchers = watchers;
    }

    /**
     *
     * @return
     * The defaultBranch
     */
    public fun getDefaultBranch(): String {
        return defaultBranch;
    }

    /**
     *
     * @param defaultBranch
     * The default_branch
     */
    public fun setDefaultBranch(defaultBranch: String) {
        this.defaultBranch = defaultBranch;
    }

    public fun getAdditionalProperties(): Map<String, kotlin.Any> {
        return this.additionalProperties;
    }

    public fun setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}