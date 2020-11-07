package com.softserveinc.ita.homeproject.services;

import com.softserveinc.ita.homeproject.api.ApiResponseMessage;
import com.softserveinc.ita.homeproject.api.NewsApiService;
import com.softserveinc.ita.homeproject.api.NotFoundException;
import com.softserveinc.ita.homeproject.model.PostNews;
import com.softserveinc.ita.homeproject.model.UpdateNews;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Service
public class NewsService implements NewsApiService {
    @Override
    public Response addNews(PostNews postNews, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteNews(Integer id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAllNews( @Min(1)Integer pageNumber,  @Min(0) @Max(10)Integer pageSize, String type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getNews(Integer id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateNews(Integer id, UpdateNews updateNews, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}