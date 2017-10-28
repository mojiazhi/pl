/**
 * 返回默认的bootstrap-table config
 *
 * @Author cukor
 */
var BSTableConfig = function (url, columns) {
    return {
        url: url,
        toolbar: '#toolbar',
        striped: true,
        cache: false,
        pagination: true,
        sortable: false,
        sidePagination: "server",
        strictSearch: true,
        clickToSelect: true,
        height: 460,
        uniqueId: "id",
        cardView: false,
        detailView: false,
        columns: columns
    };
};
