package com.rodrihgo.financeflux

/**
 * Created by Rodrihgo on 09/02/2018.
 */

object SearchRepositoryProvider {

    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(GithubApiService.Factory.create())
    }

}