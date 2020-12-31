<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="ko-KR">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>FROmme - 내 손으로 만드는 특별한 순간</title>
		<%@ include file="../main/src_forInclude.html" %>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/app/assets/css/board-style.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/app/assets/css/summernote/summernote-lite.css">
		<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Playfair+Display&subset=latin,latin-ext'>
		<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800&subset=latin,latin-ext'>
		<script src="${pageContext.request.contextPath}/app/assets/js/summernote/summernote-lite.js"></script>
		<script src="${pageContext.request.contextPath}/app/assets/js/summernote/summernote-ko-KR.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/app/assets/js/board.js"></script>
		<script>var contextPath = "${pageContext.request.contextPath}";</script>
	</head>
	<body class="size-1140">
		<c:set var="category_no" value="${requestScope.category_no}"/>
		<c:set var="boardBean" value="${requestScope.boardBean}"/>
		<!-- HEADER -->
		<header role="banner" class="position-absolute">
			<%@ include file="../main/header.jsp" %>
		</header>
		<!-- slide banner -->
		<!-- MAIN -->
		<main role="main">
			<!-- Main Header -->
			<header>
				<%@ include file="../main/banner.jsp" %>
			</header>
		</main>
		<div class="line"></div>
		<!-- MAIN -->
		<main role="main">
			<!-- Content -->
			<article>
				<div class="board_wrapper board_write_wrapper">
					<form method="post" action="${pageContext.request.contextPath}/board/BoardModifyOk.bo" name="modifyform" enctype="multipart/form-data">
						<input type="hidden" name="seq" value="${boardBean.getPost_no()}">
						<input type="hidden" name="cat" value="${boardBean.getCategory_no()}" />
						<ul class="bbsview_list">
							<li class="bbs_catname"><span>${param.catname}</span></li>
							<li class="bbs_title" style="border:none;"><input type="text" placeholder="제목을 입력해주세요." style="width: 100%;" name="board_title" value="${boardBean.getPost_title()}"></li>
							<li class="bbs_id" style="border:none;">작성자 : <span>${boardBean.getUsers_id()}</span></li>
							<textarea id="summernote" class="bbs_content" name="editordata" placeholder="내용을 입력해주세요.">${boardBean.getPost_content()}</textarea>
							<div class="text_file">
								<h4>파일 첨부</h4>
								<ul>
									<li><a href="javascript:plusFileTag()"><img class="file_img" src="${pageContext.request.contextPath}/app/assets/img/board_images/btn_plus.png">추가</a></li>
									<li><a href="javascript:minusFileTag()"><img class="file_img" src="${pageContext.request.contextPath}/app/assets/img/board_images/btn_minus.png">삭제</a></li>
								</ul>
							</div>
							<li class="bbs_file file_tag" style="display:none;">
								<div id="dropContainer">
									<div class="btn_bbs btn_file" onclick="clickFile('bbs_file1')">파일 선택</div>
									<span class="span_file span1">파일을 이 곳에 드래그 해보세요.</span>
									<input type="file" name="bbs_file1" style="opacity:0; margin-left:7%" onchange="changeValue('bbs_file1', 'span1')" 
									accept="image/*,vidio/*,audio/*,.zip,.text">
									<div class="btn_bbs btn_del" onclick="deleteFile('bbs_file1','span1')">첨부 삭제</div>
								</div>
							</li>
							<li class="bbs_file file_tag" style="display:none;">
								<div id="dropContainer">
									<div class="btn_bbs btn_file" onclick="clickFile('bbs_file2')">파일 선택</div>
									<span class="span_file span2">파일을 이 곳에 드래그 해보세요.</span>
									<input type="file" name="bbs_file2" style="opacity:0; margin-left:7%" onchange="changeValue('bbs_file2', 'span2')"
									accept="image/*,vidio/*,audio/*,.zip,.text">
									<div class="btn_bbs btn_del" onclick="deleteFile('bbs_file2','span2')">첨부 삭제</div>
								</div>
							</li>
							<li class="bbs_file file_tag" style="display:none;">
								<div id="dropContainer">
									<div class="btn_bbs btn_file" onclick="clickFile('bbs_file3')">파일 선택</div>
									<span class="span_file span3">파일을 이 곳에 드래그 해보세요.</span>
									<input type="file" name="bbs_file3" style="opacity:0; margin-left:7%" onchange="changeValue('bbs_file3', 'span3')"
									accept="image/*,vidio/*,audio/*,.zip,.text">
									<div class="btn_bbs btn_del" onclick="deleteFile('bbs_file3','span3')">첨부 삭제</div>
								</div>
							</li>
							<div class="btn_bbs_write">
								<a href="${pageContext.request.contextPath}/board/BoardView.bo?&cat=${param.cat}&seq=${param.seq}" class="btn_bbs">취소</a>
								<a href="javascript:modifyBoard()" class="btn_bbs">수정</a>
							</div>
						</ul>
					</form>        
				</div>
			</article>
		</main>
		<div class="line"></div>
		<!-- FOOTER -->
		<footer>
			<%@ include file="../main/footer.jsp" %>
		</footer>
		<script>var summernoteImages = [];</script>
		<script>
			$(document).ready(function() {
				$('#summernote').summernote({
					toolbar: [
						// [groupName, [list of button]]
						['fontname', ['fontname']],
						['fontsize', ['fontsize']],
						['style', ['bold', 'italic', 'underline','strikethrough', 'clear']],
						['color', ['forecolor','color']],
						['table', ['table']],
						['para', ['ul', 'ol', 'paragraph']],
						['height', ['height']],
						['insert',['picture','link','video']],
						['view', ['fullscreen', 'help']]
					],
					fontNames: ['Arial', 'Arial Black', 'Comic Sans MS', 'Courier New','맑은 고딕','궁서','굴림체','굴림','돋음체','바탕체'],
					fontSizes: ['8','9','10','11','12','14','16','18','20','22','24','28','30','36','50','72'],
					height: 300,                 // 에디터 높이
					minHeight: null,             // 최소 높이
					maxHeight: null,             // 최대 높이
					focus: true,                  // 에디터 로딩후 포커스를 맞출지 여부
					lang: "ko-KR",					// 한글 설정
					placeholder: '내용을 입력해 주세요.',
					callbacks: {
				           onImageUpload : function(files, editor, welEditable) {

				                for(var i = files.length - 1; i >= 0; i--) {
				                        sendFile(files[i], this);
				               }
				           }
				       }
				});
			});
		</script>
	</body>
</html>