package org.maktab.photogallery.viewModel;

import androidx.lifecycle.ViewModel;

import org.maktab.photogallery.repository.IRepository;
import org.maktab.photogallery.repository.PhotoRepository;

public class PhotoGalleryViewModel extends ViewModel {
    private IRepository mRepository;

    public PhotoGalleryViewModel() {
        mRepository = PhotoRepository.getInstance();
    }

}
