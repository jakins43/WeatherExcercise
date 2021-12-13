package com.example.weatherexercise.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B)\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\b2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/weatherexercise/adapter/ForecastAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/weatherexercise/adapter/ForecastAdapter$ForecastViewHolder;", "dataSet", "", "Lcom/example/weatherexercise/model/ForecastDetails;", "listener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "ForecastViewHolder", "app_debug"})
public final class ForecastAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.weatherexercise.adapter.ForecastAdapter.ForecastViewHolder> {
    private final java.util.List<com.example.weatherexercise.model.ForecastDetails> dataSet = null;
    private final kotlin.jvm.functions.Function1<com.example.weatherexercise.model.ForecastDetails, kotlin.Unit> listener = null;
    
    public ForecastAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherexercise.model.ForecastDetails> dataSet, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.weatherexercise.model.ForecastDetails, kotlin.Unit> listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.weatherexercise.adapter.ForecastAdapter.ForecastViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.weatherexercise.adapter.ForecastAdapter.ForecastViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherexercise/adapter/ForecastAdapter$ForecastViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/weatherexercise/databinding/ForecastRowItemBinding;", "listener", "Lkotlin/Function1;", "Lcom/example/weatherexercise/model/ForecastDetails;", "", "(Lcom/example/weatherexercise/adapter/ForecastAdapter;Lcom/example/weatherexercise/databinding/ForecastRowItemBinding;Lkotlin/jvm/functions/Function1;)V", "updateInfo", "item", "app_debug"})
    public final class ForecastViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.weatherexercise.databinding.ForecastRowItemBinding binding = null;
        private final kotlin.jvm.functions.Function1<com.example.weatherexercise.model.ForecastDetails, kotlin.Unit> listener = null;
        
        public ForecastViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.weatherexercise.databinding.ForecastRowItemBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.weatherexercise.model.ForecastDetails, kotlin.Unit> listener) {
            super(null);
        }
        
        public final void updateInfo(@org.jetbrains.annotations.NotNull()
        com.example.weatherexercise.model.ForecastDetails item) {
        }
    }
}